package Java_Post_Advanced1.CH01_Object.lang.object.poly;

public class ObjectPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        Object obj = new Object(); // Object도 인스턴스를 만들 수 있다.

        Object[] objs = {dog, car, obj}; // Object도 배열로 만들 수 있다.
        // Object 배열은 모든 타입의 객체를 담을 수 있다.

        size(objs);
    }

    // object 배열의 길이 출력하는 함수
    private static void size(Object[] objs) {
        System.out.println("전달된 객체의 수 : " + objs.length);
    }
}
