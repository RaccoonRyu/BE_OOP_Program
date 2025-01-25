package Java_Post_Advanced2.CH01_Generic.ex4;

import Java_Post_Advanced2.CH01_Generic.animal.Cat;
import Java_Post_Advanced2.CH01_Generic.animal.Dog;

public class MethodMain3 {

    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);

        ComplexBox<Dog> dogComplexBox = new ComplexBox<>();
        dogComplexBox.set(dog);

        Cat rtnCat = dogComplexBox.printAndReturn(cat);
        System.out.println("rtnCat = " + rtnCat); // 제네릭 타입, 메서드 동일하게 타입 매개변수를 T로 선언했음에도 t는 cat이 출력된다.
        // 따라서 제네릭 타입보다 제네릭 메서드가 높은 우선순위를 가진다고 할 수 있다.
    }
}
