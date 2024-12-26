package Java_Post_Advanced1.CH08_ExceptionHandling.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 { // 발생한 체크 예외를 main 밖으로 던짐
        //NetworkServiceV2_1 service = new NetworkServiceV2_1();
        //NetworkServiceV2_2 service = new NetworkServiceV2_2();
        //NetworkServiceV2_3 service = new NetworkServiceV2_3();
        //NetworkServiceV2_4 service = new NetworkServiceV2_4();
        NetworkServiceV2_5 service = new NetworkServiceV2_5();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자 : ");
            String input = sc.nextLine();
            if("exit".equals(input)) {
                break;
            }
            service.sendMessage(input); // 체크 예외 발생 부분 - 잡거나 던져야 함
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
