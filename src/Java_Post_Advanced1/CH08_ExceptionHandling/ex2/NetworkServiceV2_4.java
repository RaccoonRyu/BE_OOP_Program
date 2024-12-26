package Java_Post_Advanced1.CH08_ExceptionHandling.ex2;

// message를 이용한 네트워크 클라이언트 로직을 처리하는 부분
// 전체적인 네트워크 흐름 관리
public class NetworkServiceV2_4 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initErr(data);

        // try-catch를 사용하여 체크 예외를 잡아서 처리한다.
        // 정상-예외 흐름 분리를 위해 정상 코드와 예외 처리 코드 부를 나눈다.
        // 하나의 try 안에 정상 흐름을 모두 담는다.
        try {
            client.connect(); // 체크 예외 발생 부분
            client.send(data); // 체크 예외 발생 부분
        } catch (NetworkClientExceptionV2 e) { // 모든 예외는 catch 블럭에서 해결한다.
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
        }

        // 예외 처리 후에 disconnect() 호출을 위해 catch 아래에 작성했으나...
        // catch에서 잡을 수 없는 예외(ex 언체크 예외)가 발생하면 아래 disconnect()는 여전히 호출되지 않는 문제가 있다.
        client.disconnect();
    }
}
