package Java_Post_Advanced2.CH02_Collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 불변 컬렉션을 가변 컬렉션으로 변경하는 예제
public class ImmutableMain {
    public static void main(String[] args) {
        // 불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3);

        // 불변 리스트를 가변으로 변경
        // 불변 리스트를 새 가변 리스트의 생성자 파라미터에 담아 생성한다.
        List<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList.getClass = " + mutableList.getClass());

        // 가변을 다시 불변 리스트(java.util.Collections$UnmodifiableRandomAccessList)로 변경
        List<Integer> unmodifiabledList = Collections.unmodifiableList(mutableList);
        System.out.println("unmodifiabledList.getClass = " + unmodifiabledList.getClass());
    }
}
