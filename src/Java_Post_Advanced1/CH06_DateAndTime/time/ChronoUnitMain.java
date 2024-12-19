package Java_Post_Advanced1.CH06_DateAndTime.time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values(); // ChronoUnit은 Enum이다!
        for (ChronoUnit value : values) {
            System.out.println("value = " + value);
        }

        // ChronoUnit은 이름과 Duration을 가지고있다.
        System.out.println("ChronoUnit.HOURS = " + ChronoUnit.HOURS);
        System.out.println("ChronoUnit.HOURS.getDuration().getSeconds() = " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("ChronoUnit.DAYS = " + ChronoUnit.DAYS);
        System.out.println("ChronoUnit.DAYS.getDuration().getSeconds() = " + ChronoUnit.DAYS.getDuration().getSeconds());
        
        // 차이 구하기
        LocalTime localTime1 = LocalTime.of(1, 10, 0);
        LocalTime localTime2 = LocalTime.of(1, 20, 0);
        long betweenS = ChronoUnit.SECONDS.between(localTime1, localTime2);
        System.out.println("betweenS = " + betweenS);

        long betweenM = ChronoUnit.MINUTES.between(localTime1, localTime2);
        System.out.println("betweenM = " + betweenM);
    }
}
