package Java_Post_Advanced1.CH06_DateAndTime.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetwwen {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period period = Period.between(startDate, endDate); // 연, 월, 일 정보를 분리해서 구할 수 있다
        long between = ChronoUnit.DAYS.between(startDate, endDate);// 날짜 필드 아님. 일자만 구할 수 있다
        System.out.println("startDate = " + startDate);
        System.out.println("endDate = " + endDate);
        System.out.println("남은 기간 : " + period.getYears() + "년 " + period.getMonths() + "월 " + period.getDays() + "일");
        System.out.println("D-Day : " + between + "일 남음");
    }
}
