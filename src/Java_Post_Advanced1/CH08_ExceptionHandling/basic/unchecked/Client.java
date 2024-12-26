package Java_Post_Advanced1.CH08_ExceptionHandling.basic.unchecked;

public class Client {
    public void call() { // Unchecked 예외는 throws를 생략 가능하다. (생략 시 예외를 자동으로 밖에 던짐)
        throw new MyUncheckedException("ex");
    }
}
