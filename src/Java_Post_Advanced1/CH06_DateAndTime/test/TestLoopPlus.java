package Java_Post_Advanced1.CH06_DateAndTime.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {
            // 2주 단위로 증가하기 위한 로직
            LocalDate nextDate = localDate.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println("날짜 " + (i + 1) + " = " + nextDate);
        }
    }
}
