package Java_Post_Advanced1.CH08_ExceptionHandling.ex3;

import Java_Post_Advanced1.CH08_ExceptionHandling.ex3.exception.ConnectExceptionV3;
import Java_Post_Advanced1.CH08_ExceptionHandling.ex3.exception.NetworkClientExceptionV3;
import Java_Post_Advanced1.CH08_ExceptionHandling.ex3.exception.SendExceptionV3;

// message를 이용한 네트워크 클라이언트 로직을 처리하는 부분
// 전체적인 네트워크 흐름 관리
public class NetworkServiceV3_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initErr(data);

        // try-catch를 사용하여 체크 예외를 잡아서 처리한다.
        // 정상-예외 흐름 분리를 위해 정상 코드와 예외 처리 코드 부를 나눈다.
        // 하나의 try 안에 정상 흐름을 모두 담는다.
        try {
            client.connect(); // 체크 예외 발생 부분
            client.send(data); // 체크 예외 발생 부분

        // 예외의 세밀화에 따라 예외에 대한 다른 처리 로직을 사용할 수 있다.
        // catch 블럭은 작성된 순서대로 예외를 처리한다. - 따라서 더 디테일한 자식 예외를 먼저 잡아서 처리해야 한다.
        } catch (ConnectExceptionV3 e) { // 네트워크 클라이언트 예외 중 연결 예외 처리 (가장 치명적)
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메시지 : " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) { // 연결 외 나머지 네트워크 클라이언트 예외 전체를 포함하여 처리
            System.out.println("[네트워크 오류] 메시지 : " + e.getMessage());
        } catch (Exception e) { // 네트워크 클라이언트 예외가 아닌 다른 예외들 처리
            System.out.println("[알 수 없는 오류] 메시지 : " + e.getMessage());
        } finally {
            // try-catch 안에서 처리할 수 없는 예외가 발생해도 finally는 반드시 호출된다.
            // 이 때 실행 순서는 try 블럭 실행 -> finally 블럭 실행 -> 예외 던짐 이다.
            client.disconnect();
        }

        // try : 정상 흐름, catch : 예외 흐름, finally : 자원 해제 흐름
    }
}
