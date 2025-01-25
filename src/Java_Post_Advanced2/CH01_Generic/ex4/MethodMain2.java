package Java_Post_Advanced2.CH01_Generic.ex4;

import Java_Post_Advanced2.CH01_Generic.animal.Cat;
import Java_Post_Advanced2.CH01_Generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 200);

        // 제네릭 메서드 호출 시 타입 추론 사용
        AnimalMethod.checkUp(dog);
        AnimalMethod.checkUp(cat);

        Dog bigDog = new Dog("큰 멍멍이", 300);
        Dog biggerDog = AnimalMethod.bigger(dog, bigDog);
        System.out.println("biggerDog = " + biggerDog);
    }
}
