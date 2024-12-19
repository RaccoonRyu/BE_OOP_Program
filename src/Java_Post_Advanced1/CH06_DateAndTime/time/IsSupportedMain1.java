package Java_Post_Advanced1.CH06_DateAndTime.time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int min = now.get(ChronoField.SECOND_OF_MINUTE); // 연 월 일만 있는 자료형에서 분의 초를 꺼내달라고 한다..?
        System.out.println("min = " + min); // 예외 발생 Unsupported field: SecondOfMinute
    }
}
