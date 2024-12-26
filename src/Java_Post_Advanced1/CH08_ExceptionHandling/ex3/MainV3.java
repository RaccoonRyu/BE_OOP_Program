package Java_Post_Advanced1.CH08_ExceptionHandling.ex3;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args) {
        //NetworkServiceV3_1 service = new NetworkServiceV3_1();
        NetworkServiceV3_2 service = new NetworkServiceV3_2();
        //NetworkServiceV3_3 service = new NetworkServiceV3_3();
        //NetworkServiceV3_4 service = new NetworkServiceV3_4();
        //NetworkServiceV3_5 service = new NetworkServiceV3_5();

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
