package Java_Post_Advanced2.CH02_Collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 10;

    static int hashIndex(int value) {
        return value % CAPACITY;
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        if (!bucket.contains(value)) { // bucket 안에 중복된 값을 추가하는지 확인하는 부분. O(n)
            bucket.add(value); // 중복된 값이 없으면 bucket에 추가 (추후에 중복이 없는 set을 만들기 위해 중복된 값은 추가하지 않는다.)
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchVal) {
        int hashIndex = hashIndex(searchVal);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        return bucket.contains(searchVal); // O(n)
    }

    public static void main(String[] args) {
        // 1, 2, 5, 8, 14, 99 입력
        // 해시 충돌을 구현하기 위해 Integer 타입을 보관하는 연결 리스트의 배열을 만든다. (값이 아닌 자료 구조로 구성된 배열)
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        // buckets 배열 요소마다 연결 리스트를 생성하여 담는다. (초기화)
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
        System.out.println("Arrays.toString(buckets) = " + Arrays.toString(buckets));

        // 추가
        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); // 해시 충돌
        System.out.println("Arrays.toString(buckets) = " + Arrays.toString(buckets));

        // 검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains(" + searchValue + ") = " + contains);
    }
}
