package Java_Post_Advanced2.CH02_Collection.list.test.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> intList = new ArrayList<>();

        System.out.print("n개의 정수를 입력하세요. (0을 입력하면 종료합니다.) : ");
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            } else {
                intList.add(input);
            }
        }

        System.out.print("출력 : ");
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i));
            if (i < intList.size() - 1) { // i가 마지막일 때는 쉼표 출력하지 않음
                System.out.print(", ");
            }
        }
    }
}