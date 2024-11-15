package OOP_Advanced.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        // HashMap, LinkedHashMap, TreeMap 예제

        // Set과는 달리 제네릭에 Key, Value를 사용한다.
        HashMap<String, String> hashMap = new HashMap<>();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<String, String> treeMap = new TreeMap<>();

        // 데이터 넣는 메서드 put(key, value)
        hashMap.put("B", "B-value");
        hashMap.put("A", "A-value");
        hashMap.put("D", "D-value");
        hashMap.put("C", "C-value");
        hashMap.put("B", "BB-value"); // B를 Key로 사용하는 value를 BB-value로 변경

        linkedHashMap.put("B", "B-value");
        linkedHashMap.put("A", "A-value");
        linkedHashMap.put("D", "D-value");
        linkedHashMap.put("C", "C-value");
        linkedHashMap.put("B", "BB-value");

        treeMap.put("B", "B-value");
        treeMap.put("A", "A-value");
        treeMap.put("D", "D-value");
        treeMap.put("C", "C-value");
        treeMap.put("B", "BB-value");

        // 데이터 가져오는 메서드 get()
        System.out.println(hashMap.get("A"));

        // map에서 key 데이터를 가져오는 keySet()
        // keySet()을 통해 key를 가져오고, 해당 key를 이용해 value를 가져오는 loop
        for(String key : hashMap.keySet()) {
            System.out.println(key + " : " + hashMap.get(key));
        } // 순서 보장 없이 데이터가 들어감
        System.out.println("=========================================");

        for(String key : linkedHashMap.keySet()) {
            System.out.println(key + " : " + linkedHashMap.get(key));
        } // 데이터가 입력된 순서대로 들어감
        System.out.println("=========================================");

        for(String key : treeMap.keySet()) {
            System.out.println(key + " : " + treeMap.get(key));
        } // 순서가 보장되어(정렬되어) 데이터가 들어감
        System.out.println("=========================================");


    }
}
