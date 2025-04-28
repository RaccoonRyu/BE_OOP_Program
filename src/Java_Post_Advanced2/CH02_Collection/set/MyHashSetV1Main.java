package Java_Post_Advanced2.CH02_Collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9); // hashIndex 중복
        System.out.println("set = " + set);

        // 검색
        int searchVal = 9;
        boolean result = set.contains(searchVal);
        System.out.println("set.contains(" + searchVal + ") = " + result);

        // 삭제
        boolean removedResult = set.remove(searchVal);
        System.out.println("removedResult = " + removedResult);
        System.out.println(set);
    }
}
