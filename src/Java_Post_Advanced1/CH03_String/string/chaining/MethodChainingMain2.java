package Java_Post_Advanced1.CH03_String.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);
        
        int result = adder3.getValue();
        System.out.println("result = " + result);

        // add 함수가 자기 자신을 반환하므로 참조가 동일하여 모두 같은 참조값이 출력된다.
        System.out.println("adder = " + adder);
        System.out.println("adder1 = " + adder1);
        System.out.println("adder2 = " + adder2);
        System.out.println("adder3 = " + adder3);
    }
}
