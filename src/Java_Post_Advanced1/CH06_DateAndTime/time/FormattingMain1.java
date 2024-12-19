package Java_Post_Advanced1.CH06_DateAndTime.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        // 포맷팅 : 날짜 -> 문자
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);

        // DateTimeFormatter를 사용하여 날짜 객체를 내가 원하는 형태의 문자로 변환
        // ofPattern() : 원하는 포맷 지정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String formattedDate = date.format(formatter);
        System.out.println("날짜 포맷팅 = " + formattedDate);

        // 파싱 : 문자 -> 날짜
        String input = "2030년 01월 01일";
        LocalDate parsedDate = LocalDate.parse(input, formatter); // 주의할 점 : 날짜와 포매터의 모양이 같아야 함
        System.out.println("문자열 파싱 날짜 = " + parsedDate);
    }
}
