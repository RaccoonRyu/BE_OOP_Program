package OOP_Advanced.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListTest2 {
    public static void main(String[] args) {
        // ArrayList 정렬 예제

        ArrayList<String> arrayList = new ArrayList<>();

        // 데이터를 추가하는 add
        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("D");
        arrayList.add("B");
        arrayList.add("A");


        // 배열 컬렉션이기 때문에 foreach로 출력 가능
        for (String x : arrayList) {
            System.out.println(x);
        } // 중복을 허용하여 데이터를 추가함.
        System.out.println("============================================");

        // list는 Collection 클래스의 sort()를 사용하여 정렬 가능
        Collections.sort(arrayList);
        for (String x : arrayList) {
            System.out.println(x);
        }
        System.out.println("============================================");
    }
}
