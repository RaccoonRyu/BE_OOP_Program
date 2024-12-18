package Java_Post_Advanced1.CH05_Enum.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        // enum으로 선언한 Grade 타입 기반임을 확인할 수 있음
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        // enum은 toString을 재정의 하기 때문에 참조값을 직접 확인할 수 없다.
        // 참조값을 확인하기 위한 함수 : refValue(grade)
        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
