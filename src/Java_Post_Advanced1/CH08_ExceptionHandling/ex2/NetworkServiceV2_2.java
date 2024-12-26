package Java_Post_Advanced1.CH08_ExceptionHandling.ex2;

// message를 이용한 네트워크 클라이언트 로직을 처리하는 부분
// 전체적인 네트워크 흐름 관리
public class NetworkServiceV2_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initErr(data);

        // try-catch를 사용하여 체크 예외를 잡아서 처리한다. (예외 복구)
        try {
            client.connect(); // 체크 예외 발생 부분
        } catch (NetworkClientExceptionV2 e) {
            // 예외가 발생하면 잡아서 로깅
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
            return; // connect 실패 후 send 되지 않도록 작성. 예외를 잡아서 처리한 후에는 정상 흐름으로 복귀한다.
        }

        try {
            client.send(data); // 체크 예외 발생 부분
        } catch (NetworkClientExceptionV2 e) {
            // 예외가 발생하면 잡아서 로깅
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
            return; // 예외를 잡아서 처리한 후에는 정상 흐름으로 복귀한다.
        }
        // 예외를 잡아서 처리했기 때문에 예외가 복구되고 프로그램 또한 계속 수행할 수 있다.

        client.disconnect();
    }
}
