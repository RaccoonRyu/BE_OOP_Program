package Java_Post_Advanced1.CH06_DateAndTime.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek firstDay = date.getDayOfWeek(); // 1월의 첫번째 날 요일
        DayOfWeek lastDay = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek(); // 1월의 마지막 날 요일
        System.out.println("firstDay = " + firstDay);
        System.out.println("lastDay = " + lastDay);
    }
}
