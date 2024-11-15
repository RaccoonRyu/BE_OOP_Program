package OOP_Advanced.Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest {
    public static void main(String[] args) {
        // ArrayList, LinkedList 예제

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // 데이터를 추가하는 add
        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("D");
        arrayList.add("B");
        arrayList.add("A");

        linkedList.add("B");
        linkedList.add("A");
        linkedList.add("D");
        linkedList.add("B");
        linkedList.add("A");

        // 배열 컬렉션이기 때문에 foreach로 출력 가능
        for (String x : arrayList) {
            System.out.println(x);
        } // 중복을 허용하여 데이터를 추가함

        // 배열 컬렉션이기 때문에 foreach로 출력 가능
        for (String x : linkedList) {
            System.out.println(x);
        }
    }
}
