package Java_Post_Advanced1.CH06_DateAndTime.time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        // with() 메서드를 통한 시간 변경
        // Temporal.with()를 사용하여 날짜와 시간의 특정 필드 값(단순한 날짜)을 변경할 수 있다.
        // 참고 : with 키워드는 관습적으로 객체가 불변일 때 어떤 새로운 객체를 만들기 위해 사용한다.
        LocalDateTime changedDt1 = dt.with(ChronoField.YEAR, 2020); // ChronoField와 변경할 숫자 사용하여 연도 변경
        System.out.println("changedDt1 = " + changedDt1);

        LocalDateTime changedDt2 = dt.withYear(2020); // 편의 메서드와 변경할 숫자 사용하여 연도 변경
        System.out.println("changedDt2 = " + changedDt2);

        // 복잡한 날짜의 계산은 TemporalAdjuster 사용 (실제로는 TemporalAdjuster의 구현체 TemporalAdjusters를 사용)
        // 기준 날짜에 대한 다음 금요일 계산
        // DayOfWeek : 월~일을 나타내는 열거형
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준 날짜 : " + dt);
        System.out.println("다음 금요일 날짜 = " + with1); // 기준 날짜에 대한 다음 금요일 날짜
        
        // 이번 달 마지막 일요일
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("같은 달의 마지막 일요일 날짜 = " + with2); // 기준 날짜에 대한 같은 달의 마지막 일요일 날짜
    }
}
