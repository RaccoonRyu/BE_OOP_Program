package Java_Post_Advanced1.CH07_NestedInnerClass.anonymous.ex0;

import java.util.Random;

public class Ex1RefMainV5 {

    static void hello(CodePiece codePiece) {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        codePiece.run();
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {

        // Java 8부터 파라미터에 메서드를 인수로 던질 수 있게 된다.
        // 이를 람다 표현식이라고 한다.
        // 아래 코드를 보면 클래스나 인스턴스를 정의하지 않고, 메서드(더 정확히는 함수)의 코드 블럭을 직접 전달하는 것을 확인할 수 있다.
        hello(() -> {
            int randomVal = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomVal);
        });

        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });
        // 익명 클래스 전체를 인수로 전달할 때는 중괄호 닫을 때 세미콜론 필요하지 않음

        // 파라미터에 인스턴스를 넘길 필요 없이 코드 조각을 넘기고 싶을 때 익명 클래스를 사용하면 편리하다.
    }

}
