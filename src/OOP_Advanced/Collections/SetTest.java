package OOP_Advanced.Collections;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        // TreeSet, HashSet, LinkedHashSet 예제
        // String 제네릭으로 set 생성
        HashSet<String> hashset = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        // 데이터를 넣는 add()
        hashset.add("4");
        hashset.add("2");
        hashset.add("3");
        hashset.add("1");
        hashset.add("4"); // 해당 4는 중복되기 때문에 들어가지 않음

        linkedHashSet.add("4");
        linkedHashSet.add("2");
        linkedHashSet.add("3");
        linkedHashSet.add("1");
        linkedHashSet.add("4"); // 해당 4는 중복되기 때문에 들어가지 않음

        treeSet.add("4");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("1");
        treeSet.add("4"); // 해당 4는 중복되기 때문에 들어가지 않음

        // 출력은 iterator를 통해 수행한다.
        Iterator<String> hashSetIterator = hashset.iterator();
        while (hashSetIterator.hasNext()) {
            System.out.println(hashSetIterator.next());
        } // 값이 중복되지 않게 들어가 출력됨

        System.out.println("================================");
        Iterator<String> linkedHashSetIterator = linkedHashSet.iterator();
        while (linkedHashSetIterator.hasNext()) {
            System.out.println(linkedHashSetIterator.next());
        } // 값을 넣은 순서대로 출력됨

        System.out.println("================================");
        Iterator<String> treeSetIterator = treeSet.iterator();
        while (treeSetIterator.hasNext()) {
            System.out.println(treeSetIterator.next());
        } // 값이 내부적으로 정렬되어 출력됨
    }
}
