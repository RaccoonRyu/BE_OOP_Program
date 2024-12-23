package Java_Post_Advanced1.CH07_NestedInnerClass.anonymous.ex0;

import java.util.Random;

public class Ex1RefMainV1 {

    static void hello(CodePiece codePiece) {
        System.out.println("프로그램 시작");

        // 변하는 부분인 코드 조각을 외부에서 인터페이스의 구현체로 전달함 (다형성)
        // 코드 조각은 보통 메서드(함수)에 정의하고, 이를 전달하기 위해서는 메서드가 필요함
        // -> 인스턴스를 전달하고 인스턴스에 있는 메서드를 호출하면 된다.
        // 코드 조각 시작
        codePiece.run();
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }

    // 정적 중첩 클래스 2개 생성 (Dice, Sum)
    static class Dice implements CodePiece {
        @Override
        public void run() {
            int randomVal = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomVal);
        }
    }

    static class Sum implements CodePiece {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        hello(new Dice());
        hello(new Sum());
    }

    // 정리
    // 문자열 같은 데이터를 메서드에 전달할 때는 String, int와 같은 각 데이터에 맞는 타입을 전달
    // 코드 조각을 메서드에 전달할 때는 인스턴스를 전달하고 해당 인스턴스에 있는 메서드를 호출
}
