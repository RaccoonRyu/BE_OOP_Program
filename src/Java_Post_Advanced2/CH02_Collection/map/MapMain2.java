package Java_Post_Advanced2.CH02_Collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println(studentMap); // {studentA=90} 출력

        studentMap.put("studentA", 100); // 같은 키에 다른 값 저장 시 기존 값 교체
        System.out.println(studentMap); // {studentA=100} 출력

        boolean containsKey = studentMap.containsKey("studentA"); // containsKey() : 특정 키가 존재하는지 검사
        System.out.println("containsKey = " + containsKey); // true 반환

        studentMap.remove("studentA"); // remove() : key를 이용하여 특정 학생의 키-값 쌍(엔트리) 삭제
        System.out.println(studentMap); // {} 출력

    }
}