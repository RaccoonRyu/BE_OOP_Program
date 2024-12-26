package Java_Post_Advanced1.CH08_ExceptionHandling.ex4;


// message를 이용한 네트워크 클라이언트 로직을 처리하는 부분
// 전체적인 네트워크 흐름 관리
public class NetworkServiceV4 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initErr(data);

        // 정상-예외 흐름 분리를 위해 정상 코드와 예외 처리 코드 부를 나눈다.
        // 하나의 try 안에 정상 흐름을 모두 담는다.
        try {
            client.connect();
            client.send(data);

        // ConnectException, SendException을 잡아도 해당 오류들을 복구할 수 없기 때문에, catch로 잡지 않고 예외를 밖으로 던진다.
        } finally {
            // try-catch 안에서 처리할 수 없는 예외가 발생해도 finally는 반드시 호출된다.
            // 이 때 실행 순서는 try 블럭 실행 -> finally 블럭 실행 -> 예외 던짐 이다.
            client.disconnect();
        }

        // try : 정상 흐름, catch : 예외 흐름, finally : 자원 해제 흐름
    }
}
