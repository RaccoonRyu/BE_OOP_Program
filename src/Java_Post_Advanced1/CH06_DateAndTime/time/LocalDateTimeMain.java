package Java_Post_Advanced1.CH06_DateAndTime.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime ofDateTime = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("현재 날짜 시간 = " + nowDateTime);
        System.out.println("지정 날짜 시간 = " + ofDateTime);

        // 날짜와 시간 분리
        LocalDate ofDate = ofDateTime.toLocalDate(); // 날짜만 분리
        LocalTime ofTime = ofDateTime.toLocalTime(); // 시간만 분리
        System.out.println("ofDate = " + ofDate);
        System.out.println("ofTime = " + ofTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(ofDate, ofTime);
        System.out.println("localDateTime = " + localDateTime);

        // 계산(불변)
        LocalDateTime plusDateTime = ofDateTime.plusDays(1000);
        System.out.println("지정 날짜 시간 + 1000일 = " + plusDateTime);
        LocalDateTime plusYearDateTime = ofDateTime.plusYears(1);
        System.out.println("지정 날짜 시간 + 1년 = " + plusYearDateTime);

        // 비교
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가? " + nowDateTime.isBefore(ofDateTime)); // false
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이후인가? " + nowDateTime.isAfter(ofDateTime)); // true
        System.out.println("현재 날짜 시간이 지정 날짜 시간과 같은가? " + nowDateTime.isEqual(ofDateTime)); // false. isEqual임에 주의!

        // isEqual vs equals
        // isEqual : 비교 대상이 시간적으로만 같으면 true. 객체, 타임존이 달라도 시간적으로 같으면 true를 반환한다. 시간으로만 비교한다.
        // ex) 서울의 9시와 UTC의 0시는 시간적으로 같으므로 true 반환
        // equals : 객체의 타입, 타임존 등 내부 데이터의 모든 구성요소가 같아야 true를 반환한다.
        // ex) 서울의 9시와 UTC 0시는 시간적으로 같지만 타임존이 다르기 때문에 false 반환
    }
}
