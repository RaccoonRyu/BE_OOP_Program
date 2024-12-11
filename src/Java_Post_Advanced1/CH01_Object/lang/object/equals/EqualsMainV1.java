package Java_Post_Advanced1.CH01_Object.lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 userV1 = new UserV1("id-100");
        UserV1 userV2 = new UserV1("id-100");

        System.out.println("identity = " + (userV1 == userV2)); // 동일성 비교 - 참조값이 다르므로 다른 객체. false 출력
        System.out.println("equality = " + (userV1.equals(userV2))); // 동등성 비교 - Object의 eqauls()가 ==으로 비교(동일성 비교)함. false 출력

        // 동등성이라는 개념은 각각 클래스마다 다르다.
        // 어떤 클래스는 주민번호를, 어떤 클래스는 전화번호를, 어떤 클래스는 회원 번호를 기반으로 동등성을 처리할 수 있기 때문이다.
        // 따라서 동등성을 비교하기 위해서는 클래스의 용도에 맞게 Object의 eqauls()를 오버라이딩 해야한다!
    }
}
