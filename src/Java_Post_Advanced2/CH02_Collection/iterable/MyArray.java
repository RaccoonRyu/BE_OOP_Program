package Java_Post_Advanced2.CH02_Collection.iterable;

import java.util.Iterator;

// Iterable을 구현하여 반복(순회) 가능한 배열 클래스를 작성
public class MyArray implements Iterable<Integer>{

    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    // Iterable은 반복자를 구현한 MyArrayIterator를 반환하도록 구현한다.
    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
