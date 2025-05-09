package Java_Post_Advanced2.CH02_Collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// null을 반환하기에 애매한 상황일 때 빈 리스트를 반환하는 예제
public class EmptyListMain {
    public static void main(String[] args) {
        // List를 생성할 때 값을 넣지 않고 생성하면 빈 리스트가 반환된다.
        // 빈 가변 리스트 생성
        List<Integer> list = new ArrayList<>();

        // 빈 불변 리스트 생성
        List<Integer> emptyList1 = Collections.emptyList(); // Java 5 (...)
        List<Integer> emptyList2 = List.of(); // of 메서드에 어떤 값도 넣지 않고 생성하면 빈 불변 리스트! Java 9

        System.out.println("emptyList1.getClass = " + emptyList1.getClass()); // class java.util.Collections$EmptyList
        System.out.println("emptyList2.getClass = " + emptyList2.getClass()); // class java.util.ImmutableCollections$ListN
    }
}
