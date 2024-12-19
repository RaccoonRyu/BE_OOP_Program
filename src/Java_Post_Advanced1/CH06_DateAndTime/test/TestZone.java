package Java_Post_Advanced1.CH06_DateAndTime.test;

import java.time.*;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime seoulTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1),
                LocalTime.of(9, 0), ZoneId.of("Asia/Seoul")); // LocalDate, LocalTime, ZoneId
        ZonedDateTime euTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime amaTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간 = " + seoulTime);
        System.out.println("런던 회의 시간 = " + euTime);
        System.out.println("미국 회의 시간 = " + amaTime);

        ZonedDateTime euTime2 = seoulTime.withZoneSameLocal(ZoneId.of("Europe/London"));
        ZonedDateTime amaTime2 = seoulTime.withZoneSameLocal(ZoneId.of("America/New_York"));
        System.out.println("런던 회의 시간 2 = " + euTime2);
        System.out.println("미국 회의 시간 2 = " + amaTime2);
    }
}
