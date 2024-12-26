package Java_Post_Advanced1.CH08_ExceptionHandling.ex3;

import Java_Post_Advanced1.CH08_ExceptionHandling.ex3.exception.ConnectExceptionV3;
import Java_Post_Advanced1.CH08_ExceptionHandling.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {

    private final String address; // 접속할 외부 서버 주소
    public boolean connectErr;
    public boolean sendErr; // 연결, 전송 오류를 시뮬레이션 하기 위한 boolean 변수 두개

    public NetworkClientV3(String address) {
        this.address = address;
    }

    // 각 함수의 예외 계층을 세분화
    // 접속 - ConnectExceptionV4, 데이터 전송 - SendExceptionV3로 나눠서 던진다.
    // 이를 통해 오류 코드로 어떤 문제가 발생했는지 이해하는 것이 아니라, 예외 그 자체로 어떤 오류가 발생했는지 알 수 있다.
    public void connect() throws ConnectExceptionV3 { // 체크 예외이므로 던지는 부분 선언 필수
        if(connectErr) {
            throw new ConnectExceptionV3(address, address + " 서버 연결 실패");
        }

        // 외부 서버에 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws SendExceptionV3 {
        if(sendErr) {
            throw new SendExceptionV3(data, address + " 서버에 데이터 전송 실패 : " + data);
            // 중간에 아래처럼 언체크 같은 다른 예외가 발생했다고 가정 (NetworkServiceV2_4, V3_2)
            //throw new RuntimeException("ex");
        }

        // 외부 서버에 데이터 전송 성공
        System.out.println(address + " 서버에 데이터 전송 성공 : " + data);
    }
    // 오류가 발생했을 때 단순히 오류 코드를 반환하는 것이 아니라 예외를 던짐
    // 따라서 return할 필요가 없다.

    public void disconnect() {
        // 외부 서버에 연결 해제
        System.out.println(address + " 서버 연결 해제");
    }

    public void initErr(String data) {
        if(data.contains("error1")) {
            connectErr = true;
        }

        if(data.contains("error2")) {
            sendErr = true;
        }
    }
}
