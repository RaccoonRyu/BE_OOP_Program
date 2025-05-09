package Java_Post_Advanced2.CH02_Collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        // 편리하게 불변 컬렉션을 만들 수 있는 of 메서드
        // 불변이기 때문에 컬렉션 내부의 값을 변경할 수 없다.
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);

        // of 메서드로 생성한 컬렉션들은 변경불가능한 컬렉션$타입(ex. ImmutableCollections$ListN)으로 표현된다.
        System.out.println("list.getClass = " + list.getClass());

        // list.add(4); // java.lang.UnsupportedOperationException 예외 발생
    }
}
