package Java_Post_Advanced1.CH06_DateAndTime.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        // 생성
        Period period = Period.ofDays(10);
        System.out.println("period = " + period); // P10D (10일)

        // Period를 사용한 날짜 더하기 계산
        LocalDate localDate = LocalDate.of(2030, 1, 1);
        LocalDate plusLocalDate = localDate.plus(period);
        System.out.println("localDate = " + localDate);
        System.out.println("plusLocalDate = " + plusLocalDate);

        // Period를 사용한 기간 차이 계산
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 4, 2);
        Period between = Period.between(startDate, endDate);
        System.out.println("between = " + between); // P3M1D 3개월 1일
        System.out.println("기간 = " + between.getMonths() + "개월 " + between.getDays() + "일");
    }
}
