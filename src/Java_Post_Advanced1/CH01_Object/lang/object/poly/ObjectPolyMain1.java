package Java_Post_Advanced1.CH01_Object.lang.object.poly;

public class ObjectPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        // 객체에 맞는 다운 캐스팅 후 각 객체의 메서드 호출
        if(obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
