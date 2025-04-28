package Java_Post_Advanced2.CH02_Collection.set;

public class MyHashSetV2Main1 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET"); // B와 해시 충돌
        System.out.println(set);

        System.out.println("\"A\".hashCode() = " + "A".hashCode());
        System.out.println("\"B\".hashCode() = " + "B".hashCode());
        System.out.println("\"AB\".hashCode() = " + "AB".hashCode());
        System.out.println("\"SET\".hashCode() = " + "SET".hashCode());

        // 검색
        String searchVal = "SET";
        boolean result = set.contains(searchVal);
        System.out.println("set.contains(" + searchVal + ") = " + result);

    }
}
