package Java_Post_Advanced1.CH06_DateAndTime.time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String availableZoneId : availableZoneIds) {
            ZoneId zoneId = ZoneId.of(availableZoneId);// of() : 파라미터에 해당하는 Zone ID 객체를 얻음
            System.out.println(zoneId + " | " + zoneId.getRules()); // getRules() : Zone ID의 정보를 얻음
        }

        // 현재 컴퓨터의 운영체제가 사용하는 Zone ID 객체 얻기
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId.systemDefault() = " + zoneId);

        // 직접 Zone ID 입력하여 Zond ID 객체 얻기
        ZoneId seoulZone = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZone = " + seoulZone);
    }
}
