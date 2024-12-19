package Java_Post_Advanced1.CH06_DateAndTime.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        // 포맷팅 : 날짜와 시간 -> 문자
        LocalDateTime ldt = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDt = ldt.format(formatter);
        System.out.println("날짜와 시간 포맷팅 = " + formattedDt);
        System.out.println("ldt = " + ldt); // 참고 : ISO8601 표준에 따른 날짜 시간 표현. 날짜T시간

        // 파싱 : 문자 -> 날짜와 시간
        String dateTimeString = "2030-01-01 11:30:00";
        LocalDateTime parsedDt = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("문자열 파싱 날짜와 시간 = " + parsedDt); //  ISO8601 표준에 따른 시간 출력

    }
}
