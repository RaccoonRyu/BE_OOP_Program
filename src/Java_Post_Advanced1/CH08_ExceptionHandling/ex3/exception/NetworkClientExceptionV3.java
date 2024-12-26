package Java_Post_Advanced1.CH08_ExceptionHandling.ex3.exception;

// NetworkClient에서 발생하는 모든 예외의 부모 예외
public class NetworkClientExceptionV3 extends Exception {
    public NetworkClientExceptionV3(String message) {
        super(message);
    }
}
