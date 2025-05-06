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
}
