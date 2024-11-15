package OOP_Advanced;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Class_Date {
    public static void main(String[] args) {

        Date today = Calendar.getInstance().getTime(); // java.util import 필요. Date 클래스는 Calendar 클래스를 사용하여 가져온 값의 저장에만 사용한다.
        System.out.println(today);

        // 현재 연도만 가져온다
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(year);

        // 우리가 원하는 포맷으로 출력하기 위한 클래스 SimpleDateFormat와 format 함수
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // simpleDateFormat 클래스의 format 함수에 날짜를 넣어 출력한다.
        System.out.println(simpleDateFormat.format(today));
    }
}
