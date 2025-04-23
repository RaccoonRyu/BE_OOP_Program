package Java_Post_Advanced2.CH02_Collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println("Arrays.toString(inputArray) = " + Arrays.toString(inputArray));

        int searchVal = 8;
        for (Integer inputValue : inputArray) { // O(n)
            if(inputValue == searchVal) {
                System.out.println(inputValue);
            }
        }
    }
}
