package Java_Post_Advanced2.CH02_Collection.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        List<MyUser> userList = new LinkedList<>();
        userList.add(myUser1);
        userList.add(myUser2);
        userList.add(myUser3);

        System.out.println("기본 데이터");
        System.out.println(userList);

        System.out.println("Comparable 기본 정렬");
        userList.sort(null); // List의 sort() : 비교자를 넣어서 정렬하는 메서드. 만약 비교자를 사용하지 않으면(기본 정렬) 파라미터로 null을 넣어준다.
        System.out.println(userList); // 이 경우 나이 순으로 기본 정렬이 수행 된다.

        System.out.println("IdComparator 정렬");
        userList.sort(new IdComparator());
        System.out.println(userList); // Id 순으로 정렬이 수행된다.

        System.out.println("Collection 유틸리티인 Collections를 사용하여 정렬");
        Collections.sort(userList); // 이 경우 기본 정렬이 수행된다.
        Collections.sort(userList, new IdComparator()); // 이 경우 IdComparator 비교자를 사용한 정렬이 수행된다.

    }
}
