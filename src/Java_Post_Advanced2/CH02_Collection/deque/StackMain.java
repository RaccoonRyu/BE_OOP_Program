package Java_Post_Advanced2.CH02_Collection.deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        // Java가 제공하는 Stack
        Stack<Integer> stack = new Stack<>();

        // 데이터 입력
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        // 다음 출력할 요소를 단순 조회만 (출력하지 않음)
        System.out.println("stack.peek() = " + stack.peek());

        // 스택 요소 출력
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack);
    }

    // Java의 Stack 클래스는 내부에서 오래 전에 개발된 Vector 자료 구조를 사용하기 때문에, 사용을 권장하지 않는다.
    // Stack 대신 Deque를 사용하자.
}
