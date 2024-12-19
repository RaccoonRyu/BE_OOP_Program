package Java_Post_Advanced1.CH06_DateAndTime.time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        // 날짜와 시간을 조작할 때는 시간의 특정 단위를 변경해야 하므로, 날짜와 시간의 단위를 뜻하는 ChronoUnit을 사용한다.
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        LocalDateTime plusDt1 = dt.plus(10, ChronoUnit.YEARS); // 증가시킬 숫자와 ChronoUnit 단위로 연도 더함
        System.out.println("plusDt1 = " + plusDt1);

        LocalDateTime plusDt2 = dt.plusYears(10); // 편의 메서드에 증가시킬 숫자로 연도 더함
        System.out.println("plusDt2 = " + plusDt2);

        Period period = Period.ofYears(10);
        LocalDateTime plusDt3 = dt.plus(period); // Period를 사용해 연도 더함
        System.out.println("plusDt3 = " + plusDt3);
    }
}
