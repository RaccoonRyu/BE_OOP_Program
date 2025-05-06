package Java_Post_Advanced2.CH02_Collection.iterable;

import java.util.*;

public class JavaIterableMain {

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator = " + iterator.getClass());
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void forEach(Iterable<Integer> iterable) {
        System.out.println("iterable = " + iterable.getClass());
        for (Integer integer : iterable) {
            System.out.println(integer);
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        printAll(integers.iterator());
        forEach(integers);

        Set<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        printAll(intSet.iterator());
        forEach(intSet);
        
    }

    // 순회의 목적을 가진 어떤 특정 자료구조를 Iterable을 구현하여 작성했다면
    // 이 특정 자료구조를 순회할 반복자 또한 Iterator를 구현하여 만들어야 하는것이고,
    // 이는 반복자 디자인 패턴의 범주에 속한다.
}
