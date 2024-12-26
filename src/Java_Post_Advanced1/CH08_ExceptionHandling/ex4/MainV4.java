package Java_Post_Advanced1.CH08_ExceptionHandling.ex4;

import Java_Post_Advanced1.CH08_ExceptionHandling.ex4.exception.SendExceptionV4;

import java.util.Scanner;

// 언체크 예외들을 처리할 공통 부분이 main에 필요함 - 만약 예외를 처리하지 않으면 프로그램이 바로 종료되버린다.
public class MainV4 {
    public static void main(String[] args) {
       // NetworkServiceV4 service = new NetworkServiceV4();
        NetworkServiceV5 service = new NetworkServiceV5();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자 : ");
            String input = sc.nextLine();
            if("exit".equals(input)) {
                break;
            }

            // 예외를 공통으로 처리할 부분 작성 (try-catch, exceptionHandler 함수)
            try {
                service.sendMessage(input);
            } catch (Exception e) { // 발생한 모든 예외를 다 잡도록 Exception 사용
                // catch 블럭에서 잡으면 예외는 복구가 된 상태이다.
                // -> 전송할 문자를 다시 적을 수 있다.
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    // 예외에 대한 정보를 공통으로 처리하는 함수
    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메시지 : 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("== 개발자용 디버깅 메시지 ==");
        e.printStackTrace(System.out); // 예외 메시지와 스택 트레이스 출력

        // 필요하면 예외 별 추가 처리가 가능
        // 공통 처리를 하지만 어차피 인스턴스가 넘어오기 때문에 다운 캐스팅을 통해 예외를 분류해서 별도 처리할 수 있다.
        if(e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터 : " + sendEx.getSendData());
        }
    }
}
