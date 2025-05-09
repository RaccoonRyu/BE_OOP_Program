package Java_Post_Advanced2.CH02_Collection.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        MyUser[] userArr = {myUser1, myUser2, myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(userArr)); // 정렬하지 않은 기본 데이터 출력

        System.out.println("Comparable 기본 정렬");
        Arrays.sort(userArr); // 기본 정렬할 때 기준은 MyUser가 구현한 Comparable의 CompareTo 메서드가 제공한다.
        System.out.println(Arrays.toString(userArr));

        System.out.println("IdComparator 정렬");
        Arrays.sort(userArr, new IdComparator()); //  Arrays.sort 메서드의 인수로 Id 기준으로 비교하는 IdComparator 비교자를 사용하여 정렬한다.
        System.out.println(Arrays.toString(userArr)); // Id a, b, c 순 출력

        System.out.println("IdComparator 정렬 반전");
        Arrays.sort(userArr, new IdComparator().reversed()); // Id 기준으로 비교하는 IdComparator 비교자를 사용하여 정렬 후 결과를 반전한다.
        System.out.println(Arrays.toString(userArr)); // Id c, b, a 순 출력
    }

    // 사용자 정의 클래스를 비교하기 위해서는 Comparable을 구현하여 클래스를 정의하거나 (기본 정렬 사용)
    // 해당 클래스를 비교할 Comparator를 별도로 구현해야 한다. (기본 정렬 외 다른 정렬 방법 사용)
}
