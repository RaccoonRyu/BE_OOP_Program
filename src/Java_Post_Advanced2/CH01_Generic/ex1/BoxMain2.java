package Java_Post_Advanced2.CH01_Generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); // 다운 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); // 다운 캐스팅
        System.out.println("str = " + str);

        // 잘못된 타입의 인수가 전달될 가능성이 있다.
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // 이로 인해 String -> Integer 로 잘못 캐스팅하는 예외가 발생할 수 있음
        // ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
        System.out.println("result = " + result); // 해당 로직 실행 안됨
    }
}
