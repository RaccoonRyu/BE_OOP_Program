package Java_Post_Advanced1.CH08_ExceptionHandling.ex3.exception;

// 연결 실패 시 발생하는 예외
public class ConnectExceptionV3 extends NetworkClientExceptionV3 {
    private final String address; // 내부에 연결을 시도한 서버의 주소를 담을 변수

    public ConnectExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    // 주소 getter
    public String getAddress() {
        return address;
    }
}
