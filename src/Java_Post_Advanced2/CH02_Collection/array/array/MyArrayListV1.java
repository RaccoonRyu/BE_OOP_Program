package Java_Post_Advanced2.CH02_Collection.array.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5; // 리스트의 기본적인 데이터 수용량

    private Object[] elementData; // 모든 자료형의 데이터를 담을 수 있는 배열
    private int size = 0; // 배열의 크기가 아닌 데이터를 넣을 때 마다 증가하는 리스트의 크기

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        // 이 때 size는 배열의 전체 크기가 아님. 배열에 데이터를 순서대로 집어넣기 위해 size 사용
        elementData[size] = e;
        size++;
    }

    public Object get(int index) {
        return elementData[index];
    }

    // 특정 인덱스에 해당하는 값을 새로운 값으로 교체 후 이전 값 반환
    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    // 특정 요소의 index를 찾는 함수
    public int indexOf(Object o) {
        // 현재 배열에 실제 데이터가 들어 있는 리스트의 크기 까지만 탐색한다.
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i; // 같은 값을 찾으면 찾은 인덱스 반환
            }
        }

        return -1; // 같은 값이 없으면 -1 반환
    }

    public String toString() {
        // 실제 데이터가 들어 있는 리스트의 크기 까지만 출력한다.
        // Arrays.copyOf(배열, 사이즈) : 배열에서 사이즈 크기 만큼만 카피
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size = " + size + ", capacity = " + elementData.length;
    }
}
