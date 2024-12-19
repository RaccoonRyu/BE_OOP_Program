package Java_Post_Advanced1.CH06_DateAndTime.time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        // 생성
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration); // PT30M (30문)

        // LocalTime 계산에 사용
        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("lt = " + lt);

        LocalTime plusLt = lt.plus(duration);
        System.out.println("더한 시간 = " + plusLt);

        // 시간 차이 계산
        LocalTime startLt = LocalTime.of(9, 0);
        LocalTime endLt = LocalTime.of(10, 0);
        Duration between = Duration.between(startLt, endLt);
        System.out.println("시간 차이 = " + between.getSeconds() + "초"); // 3600초(시간) 차이
        System.out.println("근무 시간 : " + between.toHours() + "시간" + between.toMinutesPart() + "분"); // toMinutesPart() : 전체 시간에서 시간 빼고 남은 분만 표현 (ex 1:30 -> 30)
        System.out.println("근무 시간 : " + between.toHours() + "시간" + between.toMinutes() + "분"); // toMinutes() : 전체 시간을 분으로 표현 (ex 1:30 -> 30)
    }
}
