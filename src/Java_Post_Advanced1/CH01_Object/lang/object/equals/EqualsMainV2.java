package Java_Post_Advanced1.CH01_Object.lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1 == user2)); // 동일성은 false. 인스턴스 자체(참조값)가 다르기 때문에
        System.out.println("eqaulity = " + (user1.equals(user2))); // 동등성은 true. 인스턴스가 같은 id값을 가지기 때문에
    }
}
