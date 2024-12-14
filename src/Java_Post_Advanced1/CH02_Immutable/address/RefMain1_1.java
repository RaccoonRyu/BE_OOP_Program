package Java_Post_Advanced1.CH02_Immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b); // 둘 다 서울 출력

        b.setVal("부산"); // b의 val을 부산으로 변경
        System.out.println("a = " + a);
        System.out.println("b = " + b); // b만 바꿨지만 하나의 인스턴스(같은 참조값)를 공유하므로 둘 다 부산으로 변경
    }
}
