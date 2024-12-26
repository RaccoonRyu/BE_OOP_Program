package Java_Post_Advanced1.CH08_ExceptionHandling.ex2;

// message를 이용한 네트워크 클라이언트 로직을 처리하는 부분
// 전체적인 네트워크 흐름 관리
public class NetworkServiceV2_1 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 { // 발생한 체크 예외를 sendMessage 밖으로 던짐
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initErr(data);

        client.connect(); // 체크 예외 발생 부분
        client.send(data); // 체크 예외 발생 부분
        client.disconnect();
    }
}
