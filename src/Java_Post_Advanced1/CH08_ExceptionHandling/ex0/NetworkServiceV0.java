package Java_Post_Advanced1.CH08_ExceptionHandling.ex0;

// message를 이용한 네트워크 클라이언트 로직을 처리하는 부분
// 전체적인 네트워크 흐름 관리
public class NetworkServiceV0 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV0 clientV0 = new NetworkClientV0(address);

        clientV0.connect();
        clientV0.send(data);
        clientV0.disconnect();
    }
}
