package Java_Post_Advanced1.CH07_NestedInnerClass.anonymous.ex0;

import java.util.Random;

public class Ex1RefMainV2 {

    static void hello(CodePiece codePiece) {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        codePiece.run();
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {
        // 아래 Dice, Sum 로직은 main 메서드에서만 사용되므로 생성해서 바로 넘김
        // 지역 클래스를 사용
        class Dice implements CodePiece {
            @Override
            public void run() {
                int randomVal = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomVal);
            }
        }

        class Sum implements CodePiece {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }

        hello(new Dice());
        hello(new Sum());
    }

}
