package Java_Post_Advanced2.CH02_Collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque2 = new LinkedList<>(); // Deque는 구현체로 LinkedList 또한 사용할 수 있다.

        // 데이터 입력
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque); // Deque의 앞 쪽으로 1, 2 추가. [2, 1]
        deque.offerLast(3);
        System.out.println(deque); // Deque의 뒤 쪽으로 3 추가. [2, 1, 3]
        deque.offerLast(4);
        System.out.println(deque); // Deque의 뒤 쪽으로 4 추가. [2, 1, 4]

        // 다음 출력될 데이터 확인(출력하지 않고 단순 조회만)
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        // 데이터 출력
        System.out.println("deque.pollFirst() = " + deque.pollFirst()); // 2
        System.out.println("deque.pollFirst() = " + deque.pollFirst()); // 1
        System.out.println("deque.pollLast() = " + deque.pollLast()); // 4
        System.out.println("deque.pollLast() = " + deque.pollLast()); // 3 출력
        System.out.println(deque);
    }

    // Deque 구현체 ArrayDeque와 LinkedList 중에서는 ArrayDeque가 모든 면(입력, 조회)에서 더 빠르다. -> ArrayDeque가 배열 구조이기 때문에
}
