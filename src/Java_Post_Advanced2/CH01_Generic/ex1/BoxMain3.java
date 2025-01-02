package Java_Post_Advanced2.CH01_Generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        // 객체 생성 시점에 원하는 타입 지정
        // 객체 생성 시점에 T의 타입이 Integer로 결정
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(100); // Integer 타입만 허용, 그 외는 컴파일 오류
        Integer integer = integerBox.get(); // Integer 타입 반환(캐스팅 필요하지 않음)
        System.out.println("integer = " + integer);

        // 객체 생성 시점에 T의 타입이 String으로 결정
        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello"); // String 타입만 허용, 그 외에는 컴파일 오류
        String str = stringBox.get();
        System.out.println("str = " + str);

        // 제네릭 클래스를 사용하면 객체를 생성하는 시점에 원하는 모든 타입을 지정하여 사용할 수 있다.
        // 이 때 타입으로 기본형은 사용할 수 없고 참조형만 가능하다.
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.5);
        Double doubleVal = doubleBox.get();
        System.out.println("doubleVal = " + doubleVal);

        // 타입 추론 : 생성하는 제네릭 타입을 생략할 수 있다.
        GenericBox<Integer> integerBox2 = new GenericBox<>(); // new로 객체를 생성하는 부분의 제네릭 타입을 생략할 수 있다.
        // 참고 : 제네릭 변수를 선언할 때는 필수적으로 타입 정보가 있어야 한다.

    }
}
