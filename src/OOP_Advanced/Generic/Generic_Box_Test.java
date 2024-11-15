package OOP_Advanced.Generic;

public class Generic_Box_Test {

    public static void main(String[] args) {

        Generic_Box<String> b1 = new Generic_Box<>();
        b1.setBox("홍길동");

        String name = b1.getBox();
        System.out.println(name);

        Generic_Box<Integer> b2 = new Generic_Box<>();
        b2.setBox(25);

        int age = b2.getBox();
        System.out.println(age);

    }
}
