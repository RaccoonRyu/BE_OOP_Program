package Java_Post_Advanced1.CH07_NestedInnerClass.local;

public class LocalOuterV3 {
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
        //printer.print(); // 여기서 호출하지 않고 Printer 인스턴스 반환
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        // process() 호출하면 지역 클래스 LocalPrinter의 인스턴스가 생성되고 printData() 호출됨

        // printer 반환받고 main에서 print() 호출 -> process()의 스택 프레임이 사라진 이후에 실행
        printer.print();
    }
}
