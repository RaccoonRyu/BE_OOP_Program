package Java_Post_Advanced1.CH08_ExceptionHandling.ex1;

// message를 이용한 네트워크 클라이언트 로직을 처리하는 부분
// 전체적인 네트워크 흐름 관리
public class NetworkServiceV1_3 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initErr(data);

        // 반환 값으로 예외 처리 후 disconnect() 호출까지 수행
        String conResult = client.connect();
        // connect() 성공 후 오류가 없는 경우에만 send() 호출
        if(isErr(conResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + conResult);
        } else {
            String sendResult = client.send(data);
            if(isErr(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            }
        }
        // 마지막에 disconnect가 반드시 호출
        client.disconnect();
    }

    private static boolean isErr(String conResult) {
        return !"success".equals(conResult);
    }
}
