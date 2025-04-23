package Java_Post_Advanced2.CH02_Collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] elementData = new int[10];
    private int size = 0;

    // O(n)
    public boolean add(int value) {

        if(contains(value)) {
            return false;
        }

        elementData[size] = value;
        size++;
        return true;
    }

    // O(n)
    public boolean contains(int value) {
        for (int elementDatum : elementData) {
            if(elementDatum == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) + // 배열에 데이터가 입력된 만큼만 출력
                ", size=" + size +
                '}';
    }
}
