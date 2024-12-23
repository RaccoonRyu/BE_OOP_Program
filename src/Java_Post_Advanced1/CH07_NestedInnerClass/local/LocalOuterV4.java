package Java_Post_Advanced1.CH07_NestedInnerClass.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1; // 지역 변수는 스택영역의 스택 프레임이 종료되는 순간 함께 제거

        // 지역 클래스
        // 메서드 코드 블럭 안에 생성하는 클래스
        class LocalPrinter implements Printer {
            // 중첩 클래스든 내부 클래스든 지역 클래스든 모두 클래스이기 때문에 인터페이스 구현 가능

            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        // 지역 클래스는 메서드 코드 블럭 범위 안에서만 객체를 생성할 수 있다.
        LocalPrinter printer = new LocalPrinter();
        // 만약 localVar, paramVar의 값을 변경한다면?
        // localVar = 10; // 컴파일 에러 발생
        // paramVar = 10; // 컴파일 에러 발생
        // 스택 영역에 존재하는 지역 변수의 값과 인스턴스에 캡처한 캡처 변수의 값이 달라지는 문제(동기화 문제) 발생
        // 따라서 지역 클래스가 접근하는 지역 변수의 값은 변경하면 안된다. (final 혹은 사실상 final이어야 한다.)

        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        // process() 호출하면 지역 클래스 LocalPrinter의 인스턴스가 생성되고 printData() 호출됨

        // printer 반환받고 main에서 print() 호출 -> process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        // 캡처된 필드 확인
        // 지역 클래스는 인스턴스를 생성할 때 필요한 지역 변수를 먼저 캡처해서 인스턴스에 보관한다.
        // 이후 지역 클래스의 인스턴스를 통해 지역 변수에 접근하면 실제로는 인스턴스에 있는 캡처한 캡처 변수에 접근한다.
        System.out.println("필드 확인");
        Field[] fields =  printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        } // Printer가 가진 field는 value 뿐만 아니라 print()에서 사용하는 캡처된 지역 변수들도 함께 포함됨을 확인할 수 있음.
        // 또한 바깥 클래스를 참조하기 위한 필드(바깥 클래스 인스턴스의 참조 값) 또한 확인할 수 있다. Java_Post_Advanced1.CH07_NestedInnerClass.local.LocalOuterV3$1LocalPrinter.this$0
    }
}
