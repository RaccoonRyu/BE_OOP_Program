package Java_Post_Advanced2.CH02_Collection.map.test;

import java.util.HashMap;
import java.util.Map;

// 단어가 몇 번 반복되는지 출력하는 예제
public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        Map<String, Integer> map = new HashMap<>();

        String[] words = text.split(" ");
        for (String word : words) {
            Integer count = map.get(word);
            if(count == null) {
                count = 0;
            }
            count++;
            map.put(word, count);
        }

        System.out.println(map);
    }
}
