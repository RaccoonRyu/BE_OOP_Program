package Java_Post_Advanced2.CH02_Collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 50);
        System.out.println(studentMap); // {studentA=50} 출력

        // key에 해당하는 학생이 없는 경우에만 추가 1
        if(!studentMap.containsKey("studentA")) {
            studentMap.put("studentA", 100);
        }
        System.out.println(studentMap);

        // key에 해당하는 학생이 없는 경우에만 추가 2 - putIfAbsent() 사용
        studentMap.putIfAbsent("studentA", 100); // studentA key가 있으므로 실행 안됨 (값 추가하지 않음)
        studentMap.putIfAbsent("studentB", 100); // studentB key가 없으므로 실행됨 (값 추가함)
        System.out.println(studentMap);
    }
}