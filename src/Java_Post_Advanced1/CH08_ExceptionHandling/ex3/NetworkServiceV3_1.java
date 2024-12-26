package Java_Post_Advanced1.CH08_ExceptionHandling.ex3;

import Java_Post_Advanced1.CH08_ExceptionHandling.ex3.exception.ConnectExceptionV3;
import Java_Post_Advanced1.CH08_ExceptionHandling.ex3.exception.SendExceptionV3;

// message를 이용한 네트워크 클라이언트 로직을 처리하는 부분
// 전체적인 네트워크 흐름 관리
public class NetworkServiceV3_1 {
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
        } catch (ConnectExceptionV3 e) { // 연결 예외 처리
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메시지 : " + e.getMessage());
        } catch (SendExceptionV3 e) { // 전송 예외 처리
            System.out.println("[전송 오류] 전송 데이터 : " + e.getSendData() + ", 메시지 : " + e.getMessage());
        } finally {
            // try-catch 안에서 처리할 수 없는 예외가 발생해도 finally는 반드시 호출된다.
            // 이 때 실행 순서는 try 블럭 실행 -> finally 블럭 실행 -> 예외 던짐 이다.
            client.disconnect();
        }

        // try : 정상 흐름, catch : 예외 흐름, finally : 자원 해제 흐름
    }
}
