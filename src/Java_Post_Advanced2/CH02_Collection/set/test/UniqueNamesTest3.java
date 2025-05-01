package Java_Post_Advanced2.CH02_Collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        // 중복을 제거하고 데이터의 값 기준 순서를 유지해라? -> TreeSet 자료구조 사용
        Set<Integer> integerSet = new TreeSet<>(List.of(30, 20, 10, 10, 10));

        for (Integer i : integerSet) {
            System.out.println(i);
        }
    }
}
