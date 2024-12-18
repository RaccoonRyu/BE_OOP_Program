package Java_Post_Advanced1.CH04_Wrapper_Class.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        //Random rand = new Random();
        Random rand = new Random(1); // new Random(seed) : seed가 같으면 반복 실행해도 Random의 실행 결과가 항상 같다.

        int randInt = rand.nextInt(); // int에 맞는 난수 값 생성
        System.out.println("randInt = " + randInt);

        double randDouble = rand.nextDouble(); // 0.0 ~ 1.0 사이의 double 난수 값 생성
        System.out.println("randDouble = " + randDouble);

        boolean randBool = rand.nextBoolean();
        System.out.println("randBool = " + randBool);
        
        // 범위를 통한 난수 생성
        int randIntRange1 = rand.nextInt(10); // 0 ~ 9 사이의 int 난수 값 생성
        System.out.println("randIntRange1 = " + randIntRange1);

        int randIntRange2 = rand.nextInt(10) + 1; // 1 ~ 10 사이의 int 난수 값 생성
        System.out.println("randIntRange2 = " + randIntRange2);
        // 1부터 특정 숫자의 int 범위를 구하는 경우 nextInt(int bount) + 1을 사용하자.

    }
}
