package Java_Post_Advanced1.CH08_ExceptionHandling.ex4;

import Java_Post_Advanced1.CH08_ExceptionHandling.ex4.exception.ConnectExceptionV4;
import Java_Post_Advanced1.CH08_ExceptionHandling.ex4.exception.SendExceptionV4;

// RuntimeException을 상속받은 ConnectExceptionV4를 사용하도록 변경
public class NetworkClientV4 {

    private final String address; // 접속할 외부 서버 주소
    public boolean connectErr;
    public boolean sendErr; // 연결, 전송 오류를 시뮬레이션 하기 위한 boolean 변수 두개

    public NetworkClientV4(String address) {
        this.address = address;
    }

    // RuntimeException을 상속받았으므로 언체크 예외이기 때문에, throws는 전부 삭제가능하다.
    public void connect() {
        if(connectErr) {
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
        }

        // 외부 서버에 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) {
        if(sendErr) {
            throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패 : " + data);
        }

        // 외부 서버에 데이터 전송 성공
        System.out.println(address + " 서버에 데이터 전송 성공 : " + data);
    }


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
