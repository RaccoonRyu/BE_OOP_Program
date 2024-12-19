package Java_Post_Advanced1.CH06_DateAndTime.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요 : ");
        int year = sc.nextInt();
        System.out.print("월을 입력하세요 : ");
        int month = sc.nextInt();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1); // 달력을 만들기 위한 월의 첫번째 날
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1); // 달력의 마지막 날을 출력하기 위한 바로 다음 달
        // 첫번째 날 부터 다음 달 직전일까지 출력하면 된다.

        // 달력에서 해당 월의 첫 번째 날짜가 무슨 요일인지 출력하기 위해 월~일요일을 1(1%7 == 1) ~ 0(7%7 == 0)으로 표현
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa ");
        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayOfMonth; // 달의 첫 날부터
        while (dayIterator.isBefore(firstDayOfNextMonth)) { // 다음 달 직전까지 loop 수행
            System.out.printf("%2d ", dayIterator.getDayOfMonth()); // 달의 날짜 추출하여 출력
            // 이 때 %2d 포맷을 사용하여 숫자를 오른쪽으로 정렬해 넣고, 공백을 하나 줘서 숫자가 총 세칸을 차지하게 출력한다.

            // 토요일 마다 개행되도록 작성
            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }

            // 이후 하루씩 추가하며 출력하도록 날짜 증가
            dayIterator = dayIterator.plusDays(1);

        }
    }
}
