package Java_Post_Advanced2.CH02_Collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("list.getClass() = " + list.getClass());

        // 멀티 스레드 상황에서의 동시 접근 문제를 해결
        // Collections.synchronizedList()를 사용하면 일반 리스트를 멀티 스레드 상황에서 동기화 문제가 발생하지 않는 안전한 리스트로 만들 수 있다.
        List<Integer> syncronizedList = Collections.synchronizedList(list);
        System.out.println("syncronizedList.getClass() = " + syncronizedList.getClass());
    }
}
