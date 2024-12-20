package Java_Post_Advanced1.CH07_NestedInnerClass.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();
        // 중첩 클래스를 생성하려면 new 외부.중첩()를 사용한다.
        // 중첩 클래스에 접근하려면 외부.중첩을 사용한다.

        nested.print();

        System.out.println("nestedClass = " + nested.getClass()); // CH07_NestedInnerClass.nested.NestedOuter$Nested
        // 중첩 클래스들은 $로 구분
    }
}
