package Java_Post_Advanced1.CH08_ExceptionHandling.ex1;

// message를 이용한 네트워크 클라이언트 로직을 처리하는 부분
// 전체적인 네트워크 흐름 관리
public class NetworkServiceV1_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initErr(data);

        // 반환 값으로 예외 처리
        String conResult = client.connect();
        // 결과가 성공이 아님 -> 오류
        if(isErr(conResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + data);
            return; // 문제 발생 시 로그 찍고 프로그램 종료
        }

        String sendResult = client.send(data);
        if(isErr(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + data);
            return; // 문제 발생 시 로그 찍고 프로그램 종료
        }

        client.disconnect();
    }

    private static boolean isErr(String conResult) {
        return !"success".equals(conResult);
    }
}
