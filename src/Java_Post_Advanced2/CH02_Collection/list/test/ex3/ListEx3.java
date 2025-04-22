package Java_Post_Advanced2.CH02_Collection.list.test.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("n개의 정수를 입력하세요. (0을 입력하면 종료됩니다.) : ");
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            } else {
                numbers.add(input);
            }
        }

        int total = 0;
        for (Integer number : numbers) {
            total += number;
        }
        double average = (double) total / numbers.size();

        System.out.println("입력한 정수의 합계 : " + total);
        System.out.println("입력한 정수의 평균 : " + average);
    }
}
