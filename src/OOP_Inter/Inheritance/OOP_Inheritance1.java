package OOP_Inter.Inheritance;

class Person {
    public String name;

}

// extends : 클래스 상속에 사용하는 키워드
// Java에서 클래스 상속은 한 개의 클래스만 받을 수 있다(단일 상속). 즉 다중 상속은 불가하다.
class Professor extends Person {

}

public class OOP_Inheritance1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Park";

        System.out.println("사람 이름 : " + person1.name); // Park 출력

        Professor pro1 = new Professor();
        // Professor 클래스에는 name이라는 필드가 없지만 person을 상속 받았기 때문에 name 사용 가능
        pro1.name = "Park2";
        System.out.println("교직원 이름 : " + pro1.name);
    }
}
