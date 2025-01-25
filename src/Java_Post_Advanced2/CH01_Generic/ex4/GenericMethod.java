package Java_Post_Advanced2.CH01_Generic.ex4;

// 제네릭 메서드
// 특정 메서드에 제네릭을 적용
// 클래스 전체가 아니라 특정 메서드 단위로 제네릭 도입 시 사용
public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("object print : " + obj);
        return obj;
    }

    // 특정 타입을 받아서 그 타입 그대로 반환하는 메서드
    // 제네릭 메서드 정의 시 메서드 반환 타입 왼쪽에 다이아몬드(<T>) 사용하여 타입 매개변수를 기재
    // 해당 메서드를 실제 호출하는 시점에 다이아몬드를 사용해서 <Integer>와 같이 타입을 정하고 호출
    public static <T> T genericMethod(T t) {
        System.out.println("generic print : = " + t);
        return t;
    }

    // 제네릭 메서드에도 타입 매개변수 상한을 사용할 수 있다.
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print = " + t);
        return t;
    }
}
