package Java_Post_Advanced2.CH02_Collection.set.test;

import java.util.*;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {10, 20, 30, 10, 10};

        // 중복을 제거하고 입력 순서를 유지해라? -> LinkedHashSet 자료구조 사용
        Set<Integer> integerSet = new LinkedHashSet<>(List.of(inputArr)); // Collection 프레임워크는 생성자에 컬렉션을 넣어서 생성 가능
        // 배열을 리스트로 만드는 List.of(배열) or Arrays.asList(배열). Java 9 이상부터는 List.of() 권장

        for (Integer i : integerSet) {
            System.out.println(i);
        }
    }
}
