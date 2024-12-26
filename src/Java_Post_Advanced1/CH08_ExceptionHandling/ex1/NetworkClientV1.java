package Java_Post_Advanced1.CH08_ExceptionHandling.ex1;

public class NetworkClientV1 {

    private final String address; // 접속할 외부 서버 주소
    public boolean connectErr;
    public boolean sendErr; // 연결, 전송 오류를 시뮬레이션 하기 위한 boolean 변수 두개

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        if(connectErr) {
            System.out.println(address + " 서버 연결 실패");
            return "connectErr";
        }

        // 외부 서버에 연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        if(sendErr) {
            System.out.println(address + " 서버에 데이터 전송 실패 : " + data);
            return "sendErr";
        }

        // 외부 서버에 데이터 전송 성공
        System.out.println(address + " 서버에 데이터 전송 성공 : " + data);
        return "success";
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
