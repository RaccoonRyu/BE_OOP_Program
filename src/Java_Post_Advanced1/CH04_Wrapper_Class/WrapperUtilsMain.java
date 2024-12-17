package Java_Post_Advanced1.CH04_Wrapper_Class;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        // 변환
        Integer i1 = Integer.valueOf(10); // 숫자를 래퍼 객체로 변환
        Integer i2 = Integer.valueOf("10"); // 문자열을 래퍼 객체로 변환
        int intVal = Integer.parseInt("10"); // 문자열을 기본형으로 변환

        // 비교
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult); // -1 (i1이 20보다 작음) 출력

        // 산술 연산
        System.out.println("sum : " + Integer.sum(10, 20)); // 30
        System.out.println("min : " + Integer.min(10, 20)); // 10
        System.out.println("max : " + Integer.max(10, 20)); // 20
    }
}
