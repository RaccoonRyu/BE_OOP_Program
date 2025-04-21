package Java_Post_Advanced2.CH02_Collection.list;

// 직접 만든 리스트의 성능 비교
public class MyListPerfomanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("== MyArrayList 앞에 추가 ==");
        addFirst(new MyArrayList<>(), size);
        System.out.println("== MyArrayList 중간에 추가 ==");
        addMid(new MyArrayList<>(), size); // 찾는데 0(1), 데이터를 밀며 추가하는데 O(n)
        System.out.println("== MyArrayList 뒤에 추가 ==");
        addLast(new MyArrayList<>(), size); // 찾는데 0(1), 데이터를 추가하는데 O(1)

        MyArrayList<Integer> arrayList = new MyArrayList<>(); // 조회용 데이터
        addLast(arrayList, size);

        int loop = 10000;
        System.out.println("== MyArrayList 조회 ==");
        getIndex(arrayList, loop, 0); // 맨 앞에서 조회
        getIndex(arrayList, loop, size / 2); // 중간에서 조회
        getIndex(arrayList, loop, size - 1); // 마지막에서 조회

        System.out.println("== MyArrayList 검색 ==");
        search(arrayList, loop, 0); // 맨 앞에서 검색
        search(arrayList, loop, size / 2); // 중간에서 검색
        search(arrayList, loop, size - 1); // 마지막에서 검색

        System.out.println("== MyLinkedList 앞에 추가 ==");
        addFirst(new MyLinkedList<>(), size);
        System.out.println("== MyLinkedList 중간에 추가 ==");
        addMid(new MyLinkedList<>(), size); // 찾는데 0(n), 데이터를 추가하는데 O(1)
        System.out.println("== MyLinkedList 뒤에 추가 ==");
        addLast(new MyLinkedList<>(), size); // 찾는데 0(n), 데이터를 추가하는데 O(1)

        MyLinkedList<Integer> linkedList = new MyLinkedList<>(); // 조회용 데이터
        addLast(linkedList, size);

        System.out.println("== MyLinkedList 조회 ==");
        getIndex(linkedList, loop, 0); // 맨 앞에서 조회
        getIndex(linkedList, loop, size / 2); // 중간에서 조회
        getIndex(linkedList, loop, size - 1); // 마지막에서 조회

        System.out.println("== MyLinkedList 검색 ==");
        search(linkedList, loop, 0); // 맨 앞에서 검색
        search(linkedList, loop, size / 2); // 중간에서 검색
        search(linkedList, loop, size - 1); // 마지막에서 검색
    }

    // 맨 앞에 데이터를 추가하는 함수
    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    // 평균(대략적인 가운데 쯤)에 데이터를 추가하는 함수
    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i); // i / 2 위치는 대략적으로 중간쯤의 위치
        }
        long endTime = System.currentTimeMillis();
        System.out.println("중간에 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    // 맨 뒤에 데이터를 추가하는 함수
    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i); // 그냥 add는 항상 마지막에 데이터를 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    // index에 해당하는 데이터를 loop 횟수 동안 찾는 함수
    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index : " + index + ", 반복 : " + loop + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    // 특정 값에 해당하는 데이터의 인덱스를 loop 횟수 동안 찾는 함수
    private static void search(MyList<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue : " + findValue + ", 반복 : " + loop + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }
}
