package Java_Post_Advanced2.CH02_Collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        // 데이터 추가 - Stack으로
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        // 다음 출력할 데이터 확인(실제 출력하지 않고 단순 조회)
        System.out.println("stack.peek() = " + stack.peek());

        // 데이터 꺼내기
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack); // 들어갈 때는 1, 2, 3 으로 들어갔으나 나올 때는 3, 2, 1로 출력됨을 확인할 수 있다.
    }
}
