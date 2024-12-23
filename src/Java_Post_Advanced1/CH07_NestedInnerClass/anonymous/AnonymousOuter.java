package Java_Post_Advanced1.CH07_NestedInnerClass.anonymous;

import Java_Post_Advanced1.CH07_NestedInnerClass.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        // 익명 클래스
        // 기존의 지역클래스가 선언-생성이 분리돼있었다면, 익명 클래스는 생성과 동시에 구현한다.
        // 즉 선언과 생성의 두 과정을 하나로 합친 것이다.
        Printer printer = new Printer() { // 인터페이스를 구현하면서 인터페이스의 구현체를 이름 없이 만든다하여 '익명' 클래스
            // 즉 인터페이스를 생성하는 것이 아니라(원래부터 불가함) 인터페이스를 구현한 익명 클래스를 생성하는 것.
            // 인터페이스라면 구현, 부모 클래스라면 상속한 코드를 바디에 작성한다.
            // 요약하면 익명 클래스는 인터페이스(부모 클래스)를 상속(구현)하면서 바로 생성하는 것이다.
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);

                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }; // 익명 클래스의 경우에는 구현이 끝난 다음 세미콜론(;)이 필요하다.

        // 이미 생성되어있기 때문에 바로 호출 가능
        printer.print();

        // 익명 클래스는 이름이 없기 때문에 자바 내부에서 바깥 클래스 이름$숫자(여기서는 1) 처럼 표시된다. (만약 하나 더 있으면 $2..)
        System.out.println("printer.class = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
