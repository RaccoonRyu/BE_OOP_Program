package Java_Post_Advanced1.CH07_NestedInnerClass.nested.test;

public class AnonymousMain {
    public static void main(String[] args) {
        Hello hello = new Hello() {
            @Override
            public void Hello() {
                // 익명 클래스는 이름이 없기 때문애 soutm 하면 외부 클래스명을 적어줌(AnonymousMain)
                // 따라서 Hello로 편집 후 출력한다.
                System.out.println("Hello.Hello");
            }
        };

        hello.Hello();
    }
}
