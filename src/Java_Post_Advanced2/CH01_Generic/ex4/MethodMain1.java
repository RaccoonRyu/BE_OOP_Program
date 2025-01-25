package Java_Post_Advanced2.CH01_Generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerVal = GenericMethod.<Integer>numberMethod(10);
        Double doubleVal = GenericMethod.<Double>numberMethod(20.0);

        // 제네릭 메서드 타입 추론
        // Java 컴파일러는 전달되는 인자 타입과 반환 타입을 통해 타입 인자를 추론할 수 있다.
        // 타입 추론과 타입 인자 생략
        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(i);
        Integer integerVal2 = GenericMethod.numberMethod(10);
        Double doubleVal2 = GenericMethod.numberMethod(20.0);
        // 타입 추론을 통해 인자를 직접 전달하는 불편함이 줄어든다.
        // 타입을 추론해서 컴파일러가 대신 처리하기 때문에 타입을 전달하지 않는 것 처럼 보이나,
        // 실제로는 타입 인자가 전달된다.

        // 제네릭 타입 vs 제네릭 메서드
        // 정의 : GenericClass<T> vs <T> T genericMethod(T t)
        // 타입 인자 전달 : 객체를 생성하는 시점 vs 메서드를 호출하는 시점
        
        // 제네릭 메서드의 핵심 : 메서드를 호출하는 시점에 타입 인자를 전달하여 타입을 지정하며 호출하는 것
        // 제네릭 메서드는 인스턴스 메서드와 static 메서드 모두에 적용할 수 있다.
        // 하지만 제네릭 타입의 타입 매개변수는 static 메서드에 사용할 수 없다.
        // -> 제네릭 타입의 타입 매개변수는 객체를 생성하는 시점에 해당 타입이 정해지기 때문
    }
}
