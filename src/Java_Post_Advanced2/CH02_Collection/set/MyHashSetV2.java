package Java_Post_Advanced2.CH02_Collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {

    static final int DEFALUT_INITIAL_CAPACITY = 16;

    // 연결 리스트 배열 안에 하나의 연결 리스트가 있고, 하나의 연결리스트 안에 데이터가 저장되는 구조
    // 모든 타입을 받을 수 있도록 Object 사용
    private LinkedList<Object>[] buckets;

    private int size = 0; // Set에 들어간 데이터 전체 개수
    private int capacity = DEFALUT_INITIAL_CAPACITY;

    // 기본 생성자는 기본 Capacity(DEFALUT_INITIAL_CAPACITY)를 사용한다.
    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity; // capacity를 기본 값이 아닌 파라미터로 들어온 값으로 조정
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex]; // hashIndex에 해당하는 bucket(리스트 하나) 꺼냄
        if (bucket.contains(value)) { // 중복되는 값 방지
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object searchVal) {
        int hashIndex = hashIndex(searchVal);
        LinkedList<Object> bucket = buckets[hashIndex];
        return bucket.contains(searchVal);
    }

    public boolean remove(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value); // LinkedList의 remove 사용. 이 때 index 사용이 아닌 Object형으로(지울 값으로) 넘겨야함에 주의
        if(result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    private int hashIndex(Object value) {
        return Math.abs(value.hashCode()) % capacity; // 해시 코드가 음수일 수 있으므로 절댓값 씌워서 양수로 변환
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
