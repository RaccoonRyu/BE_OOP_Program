package Java_Post_Advanced1.CH01_Object.lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toString() 호출");
        System.out.println(car.toString()); // Object가 기본으로 제공하는 toString() 사용 (오버라이딩 안함)
        System.out.println(dog1.toString());
        System.out.println(dog2.toString()); // dog1, 2는 오버라이딩한 toString() 사용하여 해당 메서드 호출

        System.out.println("2. println 내부에서 toString() 호출");
        System.out.println(car); // 객체를 바로 인수로 전달해도 Object가 기본으로 제공하는 toString() 사용 (오버라이딩 안함)
        System.out.println(dog1);
        System.out.println(dog2); // 객체를 바로 인수로 전달해도 dog1, 2는 오버라이딩한 toString() 사용하여 해당 메서드 호출

        System.out.println("2. Object 다형성 활용");
        // print 메서드가 Object 타입을 매개변수로 사용하기 때문에 모든 타입의 객체를 받을 수 있다(다형적 참조!)
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        // 참고 : 객체의 참조값을 얻으려면?
        // System.identityHashCode()를 통해 참조값을 얻고, 해당 값을 16진수로 변경(Integer.toHexString())하여 확인할 수 있다.
        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue = " + refValue);

    }
}
