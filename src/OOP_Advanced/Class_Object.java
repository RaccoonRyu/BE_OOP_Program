package OOP_Advanced;

import java.util.Calendar;
import java.util.Date;

public class Class_Object {

    public static boolean isHong (String str) {

        /*if (str.equals("홍길동")) { // str이 null이 아님을 전제함 - 실무에서 주의해야할 부분
            return true;
        } else {
            return false;
        }*/

        // 아래와 같이 비교하면 NPE를 방지할 수 있다.
        if ("홍길동".equals(str)) { // Null 값이 들어올지 모르는 변수 대신 상수 리터럴 사용하여 비교
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = "이순신";
        String str3 = null;

        if (str1 == str2) { // 기본형을 비교할때는 == 연산자를 사용하고 (따라서 해당 문장은 잘못된 것)

        }

        if (str1.equals(str2)) { // 참조형을 비교할때는 equals 함수를 사용한다.

        }

        System.out.println(isHong(str1));
        System.out.println(isHong(str2));
        System.out.println(isHong(str3)); // NPE 발생

        System.out.println(str1.hashCode()); // hashCode() : hash값 출력

        Object obj1 = new Object();
        System.out.println(obj1.hashCode());
        System.out.println(obj1.toString()); // Object의 toString() : 클래스명 + @ + 해시값(16진수)
        System.out.println(str1.toString()); // String의 toString() : 그냥 문자열 값

        Date dt1 = Calendar.getInstance().getTime();
        System.out.println(dt1.toString()); // Date의 toString() : Date에 담긴 날짜와 시간 출력

        // toString은 생략해도 자동 실행
        System.out.println("=============================");
        System.out.println(obj1);
        System.out.println(str1);
        System.out.println(dt1); // 위의 toString()을 사용한 출력과 동일한 출력을 확인 가능
    }
}
