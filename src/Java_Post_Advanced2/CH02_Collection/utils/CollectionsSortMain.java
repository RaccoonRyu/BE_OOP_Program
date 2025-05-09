package Java_Post_Advanced2.CH02_Collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {
    public static void main(String[] args) {
        // 컬렉션 유틸을 사용한 정렬
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Collections : 여러 가지 유틸리티 스태틱 메서드를 제공한다.
        System.out.println("Collections.max(list) = " + Collections.max(list)); // 컬렉션 내부 중 최댓값을 꺼내온다.
        System.out.println("Collections.min(list) = " + Collections.min(list)); // 컬렉션 내부 중 최솟값을 꺼내온다.

        // Collections.shuffle() : 컬렉션 요소를 무작위로 섞는다.
        Collections.shuffle(list);
        System.out.println("shuffle list = " + list);

        // Collections.sort() : 컬렉션 요소를 정렬한다.
        Collections.sort(list);
        System.out.println("sorted list = " + list);

        // Collections.reverse() : 컬렉션 요소를 역순으로 정렬한다.
        Collections.reverse(list);
        System.out.println("reverse list = " + list);
    }
}
