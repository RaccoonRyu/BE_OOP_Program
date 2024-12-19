package Java_Post_Advanced1.CH06_DateAndTime.time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        // 날짜와 시간을 조회할 때는 시간의 특정 필드를 선택해야 하므로, 날짜와 시간의 필드를 뜻하는 ChronoField를 사용한다.
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30 , 59);
        System.out.println("YEAR = " + dt.get(ChronoField.YEAR)); // 연도 조회
        System.out.println("MONTH_OF_YEAR = " + dt.get(ChronoField.MONTH_OF_YEAR)); // 월 조회
        System.out.println("DAY_OF_MONTH = " + dt.get(ChronoField.DAY_OF_MONTH)); // 일 조회
        System.out.println("HOUR_OF_DAY = " + dt.get(ChronoField.HOUR_OF_DAY)); // 시 조회
        System.out.println("MINUTE_OF_HOUR = " + dt.get(ChronoField.MINUTE_OF_HOUR)); // 분 조회
        System.out.println("SECOND_OF_MINUTE = " + dt.get(ChronoField.SECOND_OF_MINUTE)); // 초 조회

        System.out.println("LocalDateTime 편의 메서드 제공");
        System.out.println("YEAR = " + dt.getYear()); // 연도 조회
        System.out.println("MONTH_OF_YEAR = " + dt.getMonthValue()); // 월 조회
        System.out.println("DAY_OF_MONTH = " + dt.getDayOfMonth()); // 일 조회
        System.out.println("HOUR_OF_DAY = " + dt.getHour()); // 시 조회
        System.out.println("MINUTE_OF_HOUR = " + dt.getMinute()); // 분 조회
        System.out.println("SECOND_OF_MINUTE = " + dt.getSecond()); // 초 조회

        System.out.println("편의 메서드에 없는 경우");
        System.out.println("MINUTE_OF_DAY = " + dt.get(ChronoField.MINUTE_OF_DAY)); // 하루에 있는 분만 구함 (13시간 30분 = 810분)
        System.out.println("SECOND_OF_DAY = " + dt.get(ChronoField.SECOND_OF_DAY)); // 하루에 있는 초만 구함 (13시간 30분 59초 = 48659초)
    }
}
