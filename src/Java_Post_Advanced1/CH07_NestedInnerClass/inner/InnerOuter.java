package Java_Post_Advanced1.CH07_NestedInnerClass.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    // 내부 클래스는 앞에 static이 붙지 않아 인스턴스 멤버가 된다.
    // 즉, 내부 클래스는 바깥 클래스의 인스턴스 내부에서 구성 요소로 사용된다.
    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            // 자기 자신의 인스턴스 멤버에 접근하는 것은 (당연히) 가능
            System.out.println(innerInstanceValue);

            // 외부 클래스의 인스턴스 멤버에 접근 가능. private도!
            System.out.println(outInstanceValue);

            // (당연히) 외부 클래스의 클래스 멤버에 접근 가능. private도!
            System.out.println(outClassValue);
        }
    }
}
