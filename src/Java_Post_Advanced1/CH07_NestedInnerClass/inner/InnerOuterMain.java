package Java_Post_Advanced1.CH07_NestedInnerClass.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        // 내부 클래스는 바깥 클래스의 인스턴스에 소속된다. 따라서 바깥 클래스의 인스턴스 정보를 알아야 생성 가능
        // 생성 : 바깥 클래스의 인스턴스.내부클래스() -> 내부 클래스는 바깥 클래스의 인스턴스 내부에 생성된다
        // 따라서 바깥 클래스의 인스턴스를 먼저 생성해야 내부 클래스의 인스턴스를 생성할 수 있다.
        InnerOuter.Inner inner = outer.new Inner();

        inner.print();

        System.out.println("inner class = " + inner.getClass());
        // 역시나 중첩은 InnerOuter$Inner 처럼 $중첩클래스명 으로 표현된다.
    }
}
