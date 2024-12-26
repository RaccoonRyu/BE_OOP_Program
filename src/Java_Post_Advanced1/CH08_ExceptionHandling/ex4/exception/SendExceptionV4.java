package Java_Post_Advanced1.CH08_ExceptionHandling.ex4.exception;

// 전송 실패 시 발생하는 예외
public class SendExceptionV4 extends NetworkClientExceptionV4 {
    private final String sendData; // 내부에서 전송 시도한 데이터를 담을 변수

    public SendExceptionV4(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    // 주소 getter
    public String getSendData() {
        return sendData;
    }
}
