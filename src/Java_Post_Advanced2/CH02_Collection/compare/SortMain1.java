package Java_Post_Advanced2.CH02_Collection.compare;

import java.util.Arrays;

// 배열에 들어있는 데이터를 오름차순으로 정렬하는 예제
public class SortMain1 {
    public static void main(String[] args) {
        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array));

        System.out.println("기본 정렬 후");
        // Arrays.sort() : 배열에 들어있는 데이터를 오름차순 정렬 하는 함수
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
