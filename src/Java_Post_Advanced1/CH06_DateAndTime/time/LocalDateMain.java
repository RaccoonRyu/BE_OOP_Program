package Java_Post_Advanced1.CH06_DateAndTime.time;

import java.time.LocalDate; // import 필요

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now(); // 현재 날짜기준으로 날짜 생성
        LocalDate ofDate = LocalDate.of(2013, 11, 21); // 지정 날짜기준으로 날짜 생성. 연/월/일 입력 가능
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        // 계산(불변이기 때문에 반환받을 새 날짜 필요)
        LocalDate plusDays = ofDate.plusDays(10); // plusDays() : 특정 수의 날짜를 더함
        System.out.println("지정 날짜 + 10일 = " + plusDays);
    }
}
