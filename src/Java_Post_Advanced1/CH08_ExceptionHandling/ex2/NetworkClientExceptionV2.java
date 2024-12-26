package Java_Post_Advanced1.CH08_ExceptionHandling.ex2;

// Checked 예외로 생성
public class NetworkClientExceptionV2 extends Exception{
    // 어떤 종류의 오류가 발생했는지를 구분 및 반환해줄 에러 코드
    private String errorCode;

    // 에러 코드와 예외 발생 메시지를 포함한 생성자
    // 오류 메시지는 어떤 오류가 발생했는지 개발자가 보고 이해할 수 있는 설명을 기재
    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    // 에러 코드 getter
    public String getErrorCode() {
        return errorCode;
    }
}
