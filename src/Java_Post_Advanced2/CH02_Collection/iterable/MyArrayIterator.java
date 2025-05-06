package Java_Post_Advanced2.CH02_Collection.iterable;

import java.util.Iterator;

// 반복자(Iterator)를 구현하여 배열을 반복(순회)하는 클래스 작성
public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1; // 순회 중인 현재 인덱스
    private int[] targetArr; // 순회할 배열

    // Iterator를 생성할 때는 순회하고 싶은 배열을 넣어준다.
    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < targetArr.length - 1;
    }

    @Override
    public Integer next() {
        return targetArr[++currentIndex];
    }
}
