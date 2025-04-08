package Java_Post_Advanced2.CH02_Collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        // 배열의 첫 번째 위치에 추가
        // 기존 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 첫 번째 위치에 추가
        System.out.println("배열의 첫 번째 위치에 3 추가 : O(n)");

        int newVal = 3;
        addFirst(arr, newVal);
        System.out.println(Arrays.toString(arr));

        // 배열의 특정 인덱스 위치에 추가
        // 기존 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 특정 인덱스 위치에 추가
        System.out.println("배열의 index(2) 위치에 4 추가 : O(n)");
        int index = 2;
        int val = 4;
        addAtIndex(arr, index, val);
        System.out.println(Arrays.toString(arr));

        // 배열의 마지막 위치에 추가
        System.out.println("배열의 마지막 위치에 5 추가 : O(1)");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));

    }

    private static void addLast(int[] arr, int val) {
        // 배열의 마지막 위치(arr.length - 1)에 val 추가
        arr[arr.length - 1] = val;
    }

    private static void addAtIndex(int[] arr, int index, int val) {
        // 배열의 데이터를 뒤로 한 칸씩 미는 연산 : 앞 인덱스의 데이터를 뒤 인덱스로 이동하기 때문에 loop는 뒤에서부터 수행
        // index 전의 위치에 있는 데이터는 밀 필요 없기 때문에 loop는 index까지만 수행한다.
        for (int i = arr.length - 1; i > index ; i--) {
            arr[i] = arr[i - 1];
        }

        // 미는 연산 후 특정 위치(index)에 newVal 추가
        arr[index] = val;
    }

    private static void addFirst(int[] arr, int newVal) {
        // 배열의 데이터를 뒤로 한 칸씩 미는 연산 : 앞 인덱스의 데이터를 뒤 인덱스로 이동하기 때문에 loop는 뒤에서부터 수행
        for (int i = arr.length - 1; i > 0 ; i--) {
            arr[i] = arr[i - 1];
        }

        // 미는 연산 후 첫 번째 위치에 newVal 추가
        arr[0] = newVal;
    }
}
