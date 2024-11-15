package OOP_Advanced;

import java.util.Calendar; // Calendar는 import 필요
import java.util.Date; // Date는 import 필요

public class Package_lang {
    public static void main(String[] args) {
        String str = "홍길동"; // String은 추가적으로 import하지 않음 (java.lang)
        System.out.println(str); // System은 추가적으로 import하지 않음 (java.lang)

        Date today = Calendar.getInstance().getTime(); // Date는 import 필요 (java.util에 있음)
        System.out.println(today); // 현재 날짜와 시간 출력
    }
}
