package Java_Post_Advanced1.CH08_ExceptionHandling.ex1;

// message를 이용한 네트워크 클라이언트 로직을 처리하는 부분
// 전체적인 네트워크 흐름 관리
public class NetworkServiceV1_1 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initErr(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
