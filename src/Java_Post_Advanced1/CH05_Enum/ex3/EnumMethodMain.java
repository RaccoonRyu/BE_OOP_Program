package Java_Post_Advanced1.CH05_Enum.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        //모든 ENUM 상수를 포함하는 배열 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values)); // Arrays.toString() : 배열 내부의 값을 출력할 때 사용
        for (Grade value : values) {
            System.out.println("name=" + value.name() + ", ordinal=" + value.ordinal());
            // name() : Enum 상수의 이름을 문자열로 반환
            // ordinal() : Enum 상수의 선언 순서(0부터 시작) 반환
        }

        // String -> ENUM 변환, 잘못된 문자면 IllegalArgumentException 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input); // 파라미터와 일치하는 ENUM 상수를 반환
        System.out.println("gold = " + gold); // toString() 오버라이딩 가능
    }
}
