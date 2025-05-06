package Java_Post_Advanced2.CH02_Collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 가격이 1천원인 상품들의 상품명만 출력하는 예제
public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue().equals(1000)) {
                list.add(entry.getKey());
            }
        }
        System.out.println(list);
    }
}
