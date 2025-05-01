package Java_Post_Advanced2.CH02_Collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {10, 20, 30, 10, 10};

        // 중복을 제거하고 순서가 무관하다? -> HashSet 자료구조 사용
        Set<Integer> integerSet = new HashSet<>();
        for (Integer i : inputArr) {
            integerSet.add(i);
        }

        for (Integer i : integerSet) {
            System.out.println(i);
        }
    }
}
