package Java_Post_Advanced2.CH02_Collection.compare;

import java.util.Comparator;

// Comparable을 구현한 객체의 기본 정렬이 아닌 다른 정렬 방식을 사용하기 위해 Comparator를 구현한다.
// 이 때 Comparator<정렬하려는 클래스 타입>을 구현한다.
public class IdComparator implements Comparator<MyUser> {

    // "id"를 기준으로 비교
    @Override
    public int compare(MyUser o1, MyUser o2) {
        // String에서 이미 구현한 compareTo 메서드를 사용하여 비교할 수 있다.
        return o1.getId().compareTo(o2.getId());
    }
}
