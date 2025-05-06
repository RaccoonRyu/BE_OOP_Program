package Java_Post_Advanced2.CH02_Collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>(); // map은 제네릭 타입을 key, value로 사용한다.
        
        // 학생 성적 데이터 추가 - put()
        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println("studentMap = " + studentMap); // key=value로 순서 보장없이 출력
        
        // key로 특정 학생의 값 조회 - get()
        Integer result = studentMap.get("studentD");
        System.out.println("result = " + result);

        System.out.println("KeySet 활용"); // key들로 만들어진 set 자료 구조
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            Integer val = studentMap.get(key);
            System.out.println("Key = " + key + ", val = " + val);
        }

        System.out.println("entrySet 활용"); // key-value를 묶어서 조회할 수 있는 Entry들로 만들어진 set 자료구조
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet(); // Entry는 Map 안에 중첩 클래스로 존재한다. Key와 Value를 함께 저장하는 객체라고 생각하자.
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }

        System.out.println("values 활용");
        Collection<Integer> values = studentMap.values(); // values()는 값들을 Collection으로 반환해준다. (중복이 될 수 있기 때문)
        for (Integer value : values) {
            System.out.println("value = " + value);
        }
    }
}
