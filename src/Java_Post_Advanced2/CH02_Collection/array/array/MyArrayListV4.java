package Java_Post_Advanced2.CH02_Collection.array.array;

import java.util.Arrays;

// ArrayList에 제네릭 도입
// MyArrayListV4를 제네릭 타입으로 선언한다.
// Object로 입/출력했던 곳을 타입 매개변수 E로 변경한다
public class MyArrayListV4<E> {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    // 타입 이레이저 문제로 인해 생성자에서는 Object 배열로 사용해야 함 (제네릭의 타입 매개변수 사용할 수 없음)
    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    // 데이터가 추가될 때 리스트의 가용량을 초과하는 경우를 방지하도록 코드 추가
    public void add(E e) {
        // add 메서드 내에서 데이터를 추가할 때 size가 배열의 크기에 도달하면 데이터를 추가할 수 없는 상황. grow() 호출
        if (size== elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    // 리스트의 특정 위치에 데이터를 추가하는 add 작성
    public void add(int index, E e) {
        if (size== elementData.length) {
            grow();
        }
        // 인덱스 기준 오른쪽으로 데이터 이동 후 특정 위치(인덱스)에 데이터 저장
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    // 삭제할 위치에 있는 값을 반환하고 삭제하는 함수
    public E remove(int index) {
        E oldVal = get(index);
        // 삭제를 위해 index까지만 데이터를 왼쪽으로 이동
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldVal;
    }

    @SuppressWarnings("unchecked") // 특정 메서드에 대한 경고 무시
    public E get(int index) {
        return (E) elementData[index];
    }

    // 특정 인덱스에 해당하는 값을 새로운 값으로 교체 후 이전 값 반환
    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    // 특정 요소의 index를 찾는 함수
    public int indexOf(E o) {
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

    // 요소의 마지막부터 index까지 오른쪽으로 미는 함수
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    // 요소의 index부터 마지막까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for (int i = 0; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }
}
