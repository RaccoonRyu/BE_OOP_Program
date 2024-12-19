package Java_Post_Advanced1.CH06_DateAndTime.time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println("nowOdt = " + nowOdt);

        // LocalDateTime으로 OffsetDateTime 생성
        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println("ldt = " + ldt);
        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00")); // LocalDateTime + ZoneOffset으로 OffsetDateTime 생성
        System.out.println("odt = " + odt);
        // ZoneOffset은 UTC와의 시간 차이인 오프셋 정보만 보관한다.
    }
}
