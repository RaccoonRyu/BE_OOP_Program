package Java_Post_Advanced1.CH08_ExceptionHandling.ex4.exception;

// NetworkClient에서 발생하는 모든 예외의 부모 예외
// 언체크 예외로 만들기 위해 RuntimeException 상속 받음
public class NetworkClientExceptionV4 extends RuntimeException {
    public NetworkClientExceptionV4(String message) {
        super(message);
    }
}
