package Java_Post_Advanced2.CH02_Collection.array.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        // 자료 구조 : 자료를 구조화해서 관리하는 것
        // 배열 : 인덱스가 있는 공간 안에 여러 개의 자료를 넣어서 관리하는 자료 구조
        int[] arr = new int[5];

        // 인덱스로 입력, 변경, 조회 : O(1)
        System.out.println("== Index로 입력 : O(1) ==");
        // 배열은 인덱스가 0부터 시작!
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        System.out.println("== Index로 변경 : O(1) ==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("== Index로 조회 : O(1) ==");
        System.out.println("arr[2] = " + arr[2]);
        // 배열에서 인덱스 값(번호)을 사용하면 해당하는 요소에 바로 접근하여 조회, 입력, 변경이 가능하다.

        // 배열 탐색(검색) : 데이터의 개수(n) 만큼 검색
        System.out.println("== 배열 검색 : O(n) ==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
            if(arr[i] == value) {
                System.out.println(value + " 찾음!");
                break;
            }
        }

    }
}
