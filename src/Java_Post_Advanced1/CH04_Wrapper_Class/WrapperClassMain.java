package Java_Post_Advanced1.CH04_Wrapper_Class;

public class WrapperClassMain {

    public static void main(String[] args) {
        // 기본형을 래퍼 클래스로 변경(박싱)
        Integer newInteger = new Integer(10); // 미래에 지원 만료 예정, 대신에 valueOf() 사용하자.
        Integer intObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변
        System.out.println("newInteger = " + newInteger);
        System.out.println("intObj = " + intObj);

        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("객체 내부 값 읽기");
        int intVal = intObj.intValue(); // 래퍼 클래스 안의 기본형(여기서는 정수) 값 추출(언박싱)
        System.out.println("intVal = " + intVal);
        long longVal = longObj.longValue();
        System.out.println("longVal = " + longVal);

        System.out.println("비교");
        System.out.println("== : " + (newInteger == intObj)); // false
        System.out.println("equals : " + (newInteger.equals(intObj))); // true
    }
}
