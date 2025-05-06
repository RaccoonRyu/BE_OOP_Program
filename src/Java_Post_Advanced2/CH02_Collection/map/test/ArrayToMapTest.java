package Java_Post_Advanced2.CH02_Collection.map.test;

import java.util.HashMap;
import java.util.Map;

// 배열을 Map으로 전환 -> Map<String, Integer>로 변경
public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        // Array to Map
        Map<String, Integer> productMap = new HashMap<>();
        for (String[] product : productArr) {
            productMap.put(product[0], Integer.valueOf(product[1]));
        }

        // Map의 모든 데이터 출력
        for (String key : productMap.keySet()) {
            System.out.println("제품 : " + key + ", 가격 : " + productMap.get(key));
        }
    }
}