package Java_Post_Advanced1.CH08_ExceptionHandling.basic.checked;

public class Client {
    public void call() throws MyCheckedException { // throws : 예외를 해당 메서드에서 처리하지 못하고 메서드 밖으로 던질 경우 throws 예외를 사용한다.

        // 문제 발생 -> 예외를 발생시킴
        // 예외도 객체이므로, 객체를 먼저 생성하고 throw로 던진다. (throws 아님!)
        throw new MyCheckedException("ex");
    }
}
