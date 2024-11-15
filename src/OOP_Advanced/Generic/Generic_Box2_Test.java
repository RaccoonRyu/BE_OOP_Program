package OOP_Advanced.Generic;

public class Generic_Box2_Test {

    public static void main(String[] args) {

        Generic_Box2<String> b1 = new Generic_Box2<>();
        b1.setData("홍길동", "남자");

        String name = b1.getName();
        String gender = b1.getGender();
        System.out.println("이름 : " + name +", 성별 : " + gender);

    }
}
