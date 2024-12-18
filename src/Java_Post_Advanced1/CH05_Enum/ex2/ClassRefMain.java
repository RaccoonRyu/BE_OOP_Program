package Java_Post_Advanced1.CH05_Enum.ex2;

public class ClassRefMain {

    public static void main(String[] args) {
        // 각각의 상수가 ClassGrade 타입 기반임을 확인할 수 있음
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());

        // 각각의 상수가 모두 서로 다른 ClassGrade 인스턴스를 참조하기 때문에 다른 참조값이 출력됨을 확인할 수 있음
        System.out.println("ref BASIC = " + ClassGrade.BASIC);
        System.out.println("ref GOLD = " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);
    }
}
