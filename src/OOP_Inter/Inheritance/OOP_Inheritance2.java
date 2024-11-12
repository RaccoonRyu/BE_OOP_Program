package OOP_Inter.Inheritance;

class Car {
    public String name = "차량";
    public double maxSpeed;
    public int person;

    public Car() {

    }

    public Car(double maxSpeed, int person) {
        this.maxSpeed = maxSpeed;
        this.person = person;
    }

    public void printCar() {
        System.out.println("이름 : " + name);
        System.out.println("최대 속도 : " + maxSpeed);
        System.out.println("정원 : " + person);
    }
}

/*class Bycicle extends Car {

}*/

class AutoCar extends Car {
    public String name = "자동차";
    public String baegiryang;

    public AutoCar() {
        // 만약 상위 클래스인 Car의 기본 생성자가 생성되지 않으면 Error 발생
    }

    public AutoCar(double maxSpeed, int person, String baegiryang) {
        super(maxSpeed, person);
        this.baegiryang = baegiryang;
    }

    // 메서드 오버라이딩
    public void printCar() {
        System.out.println("(차량) 이름 : " + super.name); // 부모 클래스의 멤버에 접근할 때 사용하는 super 키워드
        System.out.println("최대 속도 : " + maxSpeed);
        System.out.println("정원 : " + person);
        System.out.println("배기량 : " + baegiryang);
        System.out.println("(자동차) 이름 : " + this.name); // 나 자신의 멤버에 접근할 때 사용하는 this 키워드
    }
}

/*class Train extends Car {

}*/

public class OOP_Inheritance2 {
    public static void main(String[] args) {
        /*Car car1 = new Car();
        car1.name = "차량 1";
        car1.maxSpeed = 100;
        car1.person = 2;
        car1.printCar();

        AutoCar atCar1 = new AutoCar();
        atCar1.name = "자동차 1";
        atCar1.maxSpeed = 200;
        atCar1.person = 4;
        atCar1.baegiryang = "2000cc";
        atCar1.printCar();*/

        AutoCar atCar2 = new AutoCar(200, 4, "2000cc");
        atCar2.printCar();
    }
}
