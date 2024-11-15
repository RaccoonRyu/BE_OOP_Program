package OOP_Advanced;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Class_Date2 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now(); // LocalDate는 java.time에서 import한다.
        System.out.println(today);

        LocalTime todayTime = LocalTime.now();
        System.out.println(todayTime);

        LocalDateTime todayDateTime = LocalDateTime.now();
        System.out.println(todayDateTime);

        // java.time의 포매터 클래스 DateTimeFormatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // Date와 다르게 날짜에서 직접 formatter를 가져와서 출력한다.
        System.out.println(todayDateTime.format(dateTimeFormatter));

        System.out.println(todayDateTime.plusYears(1)
                .plusMonths(1)
                .plusDays(1)
                .format(dateTimeFormatter)); // 메서드 체이닝 가능
    }
}
