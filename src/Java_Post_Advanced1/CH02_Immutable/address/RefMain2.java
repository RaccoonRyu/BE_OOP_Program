package Java_Post_Advanced1.CH02_Immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법은 없다.

        System.out.println("a = " + a);
        System.out.println("b = " + b); // 둘 다 서울 출력

        //b.setVal("부산"); // 불변 객체이므로 b의 val을 부산으로 변경불가
        b = new ImmutableAddress("부산"); // 새 객체 생성해서 담음
        System.out.println("a = " + a);
        System.out.println("b = " + b); // 부산 출력
    }
}
