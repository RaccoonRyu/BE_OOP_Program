package Java_Post_Advanced1.CH08_ExceptionHandling.basic.checked;

// Exception 상속받아서 사용자 정의 예외 클래스 생성
// Exception을 상속 받은 예외는 Checked 예외가 된다.
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}
