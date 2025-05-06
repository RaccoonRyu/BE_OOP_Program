package Java_Post_Advanced2.CH02_Collection.deque;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new ArrayDeque<>();
        //Queue<Integer> queue2 = new LinkedList<>(); // Queue는 LinkedList 또한 사용할 수 있다.

        // 데이터 추가
        queue1.offer(1);
        queue1.offer(2);
        queue1.offer(3);
        System.out.println(queue1);

        // 다음 출력할 데이터 단순 조회(출력하지 않음)
        System.out.println("queue1.peek() = " + queue1.peek());

        // 데이터 출력
        System.out.println("queue1.poll() = " + queue1.poll());
        System.out.println("queue1.poll() = " + queue1.poll());
        System.out.println("queue1.poll() = " + queue1.poll());
        System.out.println(queue1);
    }
}
