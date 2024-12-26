package Java_Post_Advanced1.CH08_ExceptionHandling.basic.unchecked;

// MyUncheckedException 예외는 예외를 잡거나 던지지 않아도 된다.
// 예외를 잡지 않으면 자동으로 밖에 던진다.
public class Service {
    Client client = new Client();

    // 필요한 경우 예외를 잡아서 처리할 수 있다.
    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            // 예외 처리 로직
            System.out.println("예외 처리, message : " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    // 예외를 잡지 않아도 된다.
    // 예외를 잡지 않으면 자연스럽게 해당 함수를 호출한 상위로 예외를 던진다.
    // 따라서 체크 예외와 다르게 throws 예외 선언을 하지 않아도 된다.
    public void callThrow() {
        client.call();
    }
}
