package Java_Post_Advanced2.CH02_Collection.map;

import java.util.*;

public class JavaMapMain {

    private static void run(Map<String, Integer> map) {
        System.out.println("map = " + map.getClass());
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.print(key + " = " + map.get(key) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        run(new HashMap<>()); // 순서 없이 출력. HashMap은 Key를 사용하여 HashCode를 생성한다.
        run(new LinkedHashMap<>()); // key를 기준으로 입력한 순서대로 출력
        run(new TreeMap<>()); // key 자체의 값 기준으로 정렬한대로 출력
    }

    // Map의 Key로 사용되는 객체는 반드시 hashCode(), equals()를 구현해야 한다. (Set 때랑 동일!)
}
