package Java_Post_Advanced2.CH02_Collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueStackMain {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();

        // 데이터 입력 - Queue로
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        // 다음에 출력할 데이터 확인(실제 출력이 아닌 단순 조회)
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.peek() = " + queue.peek());

        // 데이터 출력
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println(queue);
    }
}
