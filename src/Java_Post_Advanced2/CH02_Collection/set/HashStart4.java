package Java_Post_Advanced2.CH02_Collection.set;

import java.util.Arrays;

public class HashStart4 {

    static final int CAPACITY = 10;

    static int hashIndex(int value) {
        return value % CAPACITY;
    }

    // value를 이용하여 hashIndex를 구하고, 해당 hashIndex를 배열의 인덱스로 사용하여 value를 배열에 추가
    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }

    public static void main(String[] args) {
        // 입력 1, 2, 5, 8, 14, 99
        // 데이터를 입력할 때 배열에 순서대로 입력하는 것이 아니라, 해시 인덱스 사용
        // 해시 인덱스 = 배열에 들어갈 값을 CAPACITY로 나머지 연산한 값. 이 값을 배열의 인덱스로 사용한다.
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));

        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99); // O(1)
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        // 검색
        // hashIndex를 구하고, hashIndex를 기반으로 배열에 접근해 값을 꺼내온다.
        int searchVal = 14;
        int hashIndex = hashIndex(searchVal);
        System.out.println("searchVal의 hashIndex = " + hashIndex);
        Integer result = inputArray[hashIndex]; // O(1)
        System.out.println(result);
    }
}
