package Java_Post_Advanced1.CH06_DateAndTime.test;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        // 메서드 체이닝 사용
        LocalDateTime futureDate = date.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("기준 시각 = " + date);
        System.out.println("1년 2개월 3일 4시간 후 시각 = " + futureDate);
    }
}
