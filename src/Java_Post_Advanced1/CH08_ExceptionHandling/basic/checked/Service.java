package Java_Post_Advanced1.CH08_ExceptionHandling.basic.checked;

public class Service {

    Client client = new Client();

    // Checked 예외를 잡아서 처리하는 코드
    // try-catch문을 사용하여 예외를 처리한다.
    public void callCatch() {
        try { // 예외가 발생할 수 있는 부분을 감싸는 try 블럭
            client.call();
        } catch (MyCheckedException e) { // try 블럭에서 발생한 예외를 잡아 처리하는 catch 블럭
            System.out.println("예외 처리, message : " + e.getMessage());
        }
        // catch 블럭에서 개발자가 원하는 로직으로 예외를 처리한 후 정상 흐름으로 코드 전환
        System.out.println("정상 흐름");
    }

    // Checked 예외를 밖으로 던지는 코드
    // Checked 예외는 예외를 집지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 작성해야 한다.
    public void catchThrow() throws MyCheckedException {
        client.call();
    }
}
