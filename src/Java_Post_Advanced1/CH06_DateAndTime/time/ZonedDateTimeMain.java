package Java_Post_Advanced1.CH06_DateAndTime.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("현재 Zone 날짜시간 = " + nowZdt); // 별도 지정이 없으면 타임존은 시스템 기본값을 사용함

        // LocalDateTime 기반으로 ZonedDateTime 만들기
        LocalDateTime lDt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        ZonedDateTime zDt1 = ZonedDateTime.of(lDt, ZoneId.of("Asia/Seoul")); // LocalDateTime + ZoneId 조합해서 ZonedDateTime 생성
        System.out.println("zDt1 = " + zDt1);

        // 아래와 같이 ZonedDateTime을 만들 수 있다. (나노초까지 포함)
        ZonedDateTime zDt2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0, ZoneId.of("Asia/Seoul"));

        // TimeZone 변경
        ZonedDateTime utcZdt = zDt2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utcZdt = " + utcZdt); // TimeZone이 UTC로 바뀌어 위에서 설정한(서울) 9시간을 뺀 4시로 바뀜
    }
}
