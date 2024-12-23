package Java_Post_Advanced1.CH07_NestedInnerClass.nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        // 내부 클래스의 인스턴스 생성
        // 바깥 클래스의 인스턴스를 토대로 내부 클래스의 인스턴스를 만들기 때문에, 바깥 클래스의 인스턴스를 먼저 생성하고 내부 클래스의 인스턴스를 생성한다.
        OuterClass2.InnerClass innerClass = new OuterClass2().new InnerClass();
        innerClass.hello();
    }
}
