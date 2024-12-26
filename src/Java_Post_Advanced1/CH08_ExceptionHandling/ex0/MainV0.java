package Java_Post_Advanced1.CH08_ExceptionHandling.ex0;

import java.util.Scanner;

public class MainV0 {
    public static void main(String[] args) {
        NetworkServiceV0 service = new NetworkServiceV0();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자 : ");
            String input = sc.nextLine();
            if("exit".equals(input)) {
                break;
            }
            service.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
