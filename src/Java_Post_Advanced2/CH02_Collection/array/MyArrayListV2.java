package Java_Post_Advanced2.CH02_Collection.array;

import java.util.Arrays;

public class MyArrayListV2 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    // 데이터가 추가될 때 리스트의 가용량을 초과하는 경우를 방지하도록 코드 추가
    public void add(Object e) {
        // add 메서드 내에서 데이터를 추가할 때 size가 배열의 크기에 도달하면 데이터를 추가할 수 없는 상황. grow() 호출
        if (size== elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    // 큰 배열을 새로 만들고 기존 배열의 값을 복사하는 함수
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

        // 배열을 새로 만들고 기존 배열을 새 배열에 복사
        Object[] newArr =  new Object[newCapacity];

        for (int i = 0; i < elementData.length; i++) {
            newArr[i] = elementData[i];
        }

        // 기존 배열 대신 큰 배열을 쓰도록 참조를 변경한다.
        elementData = newArr;

        // 상술한 로직은 아래 로직처럼 작성할 수도 있다.
        // Arrays.copyOf(기존배열, 새로운 배열 길이) : 기존 배열을 복사하여 새로운 길이의 배열을 만들어줌
        // elementData = Arrays.copyOf(elementData, newCapacity);
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
