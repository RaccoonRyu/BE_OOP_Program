package Java_Post_Advanced1.CH02_Immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {
        // 기본형 변수는 절대로 같은 값을 공유하지않는다.
        int a = 10;
        int b = a; // a -> b 값 복사 후 대입
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("a = " + a); // a는 그대로 10 출력
        System.out.println("b = " + b); // b는 20 출력
    }
}
