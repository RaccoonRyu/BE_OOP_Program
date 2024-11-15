package OOP_Advanced.Generic;

public class Box_Test {

    public static void main(String[] args) {

        Box b1 = new Box();
        b1.setBox("홍길동");
        String name = (String) b1.getBox(); // Object로 홍길동을 담았기 때문에 형변환 필요
        System.out.println(name);

        Box b2 = new Box();
        b2.setBox(25);
        Integer age = (Integer) b2.getBox(); // Object로 25fmf 담았기 때문에 형변환 필요
        System.out.println(age);

        Integer count = (Integer) b1.getBox(); // b1 박스에 담겨있는 데이터는 문자열인데 Integer로 담았기 때문에, 소스상에서는 문제가 없지만 실행 시 형 변환 에러 발생
        System.out.println(count);
    }
}
