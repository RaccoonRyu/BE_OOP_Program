package Java_Post_Advanced1.CH07_NestedInnerClass.anonymous.ex0;

import java.util.Random;

public class Ex1RefMainV4 {

    static void hello(CodePiece codePiece) {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        codePiece.run();
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {

        // 익명 클래스는 참조 값을 따로 담지 않고 통째로 파라미터로 넘길 수 있다
        hello(new CodePiece() {
            @Override
            public void run() {
                int randomVal = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomVal);
            }
        });
        hello(new CodePiece() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
        // 익명 클래스 전체를 인수로 전달할 때는 중괄호 닫을 때 세미콜론 필요하지 않음

        // 파라미터에 인스턴스를 넘길 필요 없이 코드 조각을 넘기고 싶을 때 익명 클래스를 사용하면 편리하다.
    }

}
