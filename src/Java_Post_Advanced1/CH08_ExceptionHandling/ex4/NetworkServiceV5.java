package Java_Post_Advanced1.CH08_ExceptionHandling.ex4;


// message를 이용한 네트워크 클라이언트 로직을 처리하는 부분
// 전체적인 네트워크 흐름 관리
public class NetworkServiceV5 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        // 정상-예외 흐름 분리를 위해 정상 코드와 예외 처리 코드 부를 나눈다.
        // 하나의 try 안에 정상 흐름을 모두 담는다.
        // try-with-resources 사용 : try (자원으로 사용하는 객체 명시) { 블럭 }
        // 해당 자원은 try 블럭이 끝나면 자동으로 AutoCloseable.close()를 호출해서 자원을 해제한다.
        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initErr(data);
            client.connect();
            client.send(data);
        } catch (Exception e) { // 언체크 예외이므로 해당 블럭이 없어도 되지만 메시지 출력 확인을 위해 작성
            System.out.println("[예외 확인] : " + e.getMessage());
            throw e;
        }
        // try-with-resources를 사용했기 때문에 finally에서 자원 반납하는 부분을 지워도 정상 실행된다.

        // try : 정상 흐름, catch : 예외 흐름, finally : 자원 해제 흐름
    }
}
