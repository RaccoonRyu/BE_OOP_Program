package Java_Post_Advanced2.CH02_Collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        // 자바가 제공하는 HashSet, LinkedHashSet, TreeSet으로 예제 작성
        run(new HashSet<>()); // class java.util.HashSet, 데이터의 순서는 무작위
        run(new LinkedHashSet<>()); // class java.util.LinkedHashSet, 데이터의 순서는 입력된 순서대로
        run(new TreeSet<>()); // class java.util.TreeSet. 데이터의 순서는 값 기준으로 정렬된 순서
    }

    // String Set을 사용하여 공통 실행하는 함수
    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator(); // 자료구조의 반복(출력)을 위해 사용하는 iterator
        while (iterator.hasNext()) { // hasNext() : 다음 데이터가 있는지 확인(T/F)
            System.out.print(iterator.next() + " "); // next() : 다음 데이터를 반환
        }
        System.out.println();
    }
}
