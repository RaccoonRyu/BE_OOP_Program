package Java_Post_Advanced1.CH06_DateAndTime.time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now();// UTC 기준 생성
        System.out.println("now = " + now); // 한국 기준 9시간 뺀 시간이 출력됨 - UTC 기준이므로

        // ZonedDateTime에서 Instant 뽑기
        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from); // 타임존 정보를 UTC로 변환해서 Instant로 뽑을 수 있다.

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart); // 1970-01-01(기준일, 에포크 시간)에 0초 더해서 출력
        
        // 계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later); // 기준일에 3600초(1시간) 더하여 출력

        // 조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond); // 기준일로부터 지난 시간(여기서는 3600초) 출력
    }
}
