package Java_Post_Advanced2.CH02_Collection.map.test;

import java.util.HashMap;
import java.util.Map;

// 단어가 몇 번 반복되는지 출력하는 예제
public class WordFrequencyTest2 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        Map<String, Integer> map = new HashMap<>();

        String[] words = text.split(" ");
        for (String word : words) {
            // getOrDefault() : key에 해당하는 값이 없으면 기본값을 반환
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}
