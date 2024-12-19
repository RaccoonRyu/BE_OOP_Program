package Java_Post_Advanced1.CH06_DateAndTime.time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        // isSupported() : 현재 객체 타입에서 특정 시간 단위나 필드를 사용할 수 있는지 확인하는 메서드
        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("supported = " + supported);

        if(supported) {
            int min = now.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println("min = " + min);
        }
    }
}
