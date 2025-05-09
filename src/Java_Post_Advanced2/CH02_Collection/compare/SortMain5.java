package Java_Post_Advanced2.CH02_Collection.compare;

import java.util.*;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        Set<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);

        System.out.println("Comparable 기본 정렬");
        // 데이터가 들어가는 순간에 기본 정렬이 되어있으므로 단순히 출력하면 된다.
        System.out.println(treeSet1);

        Set<MyUser> treeSet2 = new TreeSet<>(new IdComparator()); // 생성자에 별도의 IdComparator 비교자를 넣어서 기본 정렬이 아닌 비교자 기준 정렬로 생성한다.
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);

        System.out.println("IdComparator 정렬");
        // 데이터가 들어가는 순간에 IdComparator 기준 정렬이 되어있으므로 단순히 출력하면 된다.
        System.out.println(treeSet2);

    }
}
