package Java_Post_Advanced2.CH02_Collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");
        while (iterator.hasNext()) {
            Integer val = iterator.next();
            System.out.println("val = " + val);
        }

        // 추가
        System.out.println("for-each 사용");
        for (Integer val : myArray) { // MyArray가 Iterable을 구현하지 않으면 향상된 for문(for-each) 사용 불가!
            System.out.println("iterVal = " + val);
        }
    }
}
