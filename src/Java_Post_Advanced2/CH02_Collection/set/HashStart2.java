package Java_Post_Advanced2.CH02_Collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        // 입력 1, 2, 5, 8
        // 데이터를 입력할 때 배열에 순서대로 입력하는 것이 아니라, 데이터의 값을 인덱스로 사용해서 저장
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("Arrays.toString(inputArray) = " + Arrays.toString(inputArray));
        // Arrays.toString(inputArray) = [null, 1, 2, null, null, 5, null, null, 8, null] 출력

        int searchVal = 8;
        Integer result = inputArray[searchVal]; // 배열의 인덱스를 들어간 값으로 사용 - O(1)
        System.out.println("result = " + result);

    }
}
