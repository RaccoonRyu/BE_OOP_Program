package Java_Post_Advanced1.CH06_DateAndTime.time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(10, 18, 30);

        System.out.println("현재 시간 = " + nowTime);
        System.out.println("지정 시간 = " + ofTime);

        // 계산(불변이기 때문에 반환받을 새 시간 필요)
        LocalTime plusTime = ofTime.plusSeconds(25);
        System.out.println("지정 시간 + 25초 = " + plusTime);
    }
}
