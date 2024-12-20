package Java_Post_Advanced1.CH07_NestedInnerClass.local;

public class LocalOuterV1 {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        // 지역 클래스
        // 메서드 코드 블럭 안에 생성하는 클래스
        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value = " + value);
                // 지역 클래스는 자신이 속한 코드 블럭의 파라미터를 포함한 지역 변수에 접근할 수 있다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);

                // 지역 클래스 또한 내부 클래스이므로 바깥 클래스의 인스턴스에 소속이 되기 때문에 바깥 클래스의 멤버에 접근 가능
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        // 지역 클래스는 메서드 코드 블럭 범위 안에서만 객체를 생성할 수 있다.
        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
        // process() 호출하면 지역 클래스 LocalPrinter의 인스턴스가 생성되고 printData() 호출됨


    }
}
