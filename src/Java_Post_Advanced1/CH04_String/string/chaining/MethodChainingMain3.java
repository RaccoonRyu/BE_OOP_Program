package Java_Post_Advanced1.CH04_String.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        // 메서드 호출의 결과로 자기 자신의 참조값을 반환하면, 해당 참조값을 사용하여 메서드 호출을 계속 이어갈 수 있음
        // 이를 메서드 체이닝이라고 한다.
        // 메서드 체이닝을 사용하면 메서드가 끝나는 시점에 바로 .(dot)을 찍어 변수명을 생략할 수 있다.
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);

    }
}
