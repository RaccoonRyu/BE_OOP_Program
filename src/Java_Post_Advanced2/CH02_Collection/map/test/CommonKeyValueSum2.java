package Java_Post_Advanced2.CH02_Collection.map.test;

import java.util.HashMap;
import java.util.Map;

// 같은 key를 가진 다른 map 요소 value의 합 구하는 예제
public class CommonKeyValueSum2 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3); // Map.of(k, v, k, v, ...) 로 Map을 생성할 수 있다.
        // 이 때 반환타입은 HashMap은 아니기 때문에 Map 인터페이스로 받아야 한다.
        // 또한 이 Map.of를 사용해 만든 Map은 내부의 값을 수정할 수 없다. (불변)

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        Map<String, Integer> result = new HashMap<>();
        for (String key : map1.keySet()) {
            // map1의 entry 중 map2와 key가 같은 것을 찾고, 해당하는 map1과 map2 entry의 value 합 구하기
            if(map2.containsKey(key)) {
                result.put(key, map1.get(key) + map2.get(key));
            }
        }
        System.out.println(result);
    }
}
