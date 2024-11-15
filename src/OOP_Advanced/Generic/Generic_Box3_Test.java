package OOP_Advanced.Generic;

public class Generic_Box3_Test {

    public static void main(String[] args) {

        Generic_Box3<String, Integer> b1 = new Generic_Box3<>();
        b1.setData("홍길동", 25);

        String name = b1.getName();
        int age = b1.getAge();
        System.out.println("이름 : " + name +", 나이 : " + age);

    }
}
