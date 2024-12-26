package Java_Post_Advanced1.CH08_ExceptionHandling.basic.unchecked;

// RuntimeException 상속받아서 사용자 정의 예외 클래스 생성
// RuntimeException를 상속 받은 예외는 Unchecked 예외가 된다.
public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}
