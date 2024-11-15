package OOP_Advanced.Collections;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector vector = new Vector(); // java.util import 필요

        // 데이터를 넣는 add(파라미터)
        vector.add("홍길동");
        vector.add("남자");
        vector.add(25);
        vector.add(80.15);

        // 데이터를 가져오는 get(index)
        System.out.println(vector.get(0));
        System.out.println(vector.get(1));
        System.out.println(vector.get(2));
        System.out.println(vector.get(3));
    }
}
