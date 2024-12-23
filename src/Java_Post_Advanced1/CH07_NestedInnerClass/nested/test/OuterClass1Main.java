package Java_Post_Advanced1.CH07_NestedInnerClass.nested.test;

public class OuterClass1Main {
    public static void main(String[] args) {
        // 정적 중첩 클래스 생성
        OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass();
        nestedClass.hello();
    }
}
