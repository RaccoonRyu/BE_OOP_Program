package Java_Post_Advanced2.CH01_Generic.ex5;

import Java_Post_Advanced2.CH01_Generic.animal.Animal;
import Java_Post_Advanced2.CH01_Generic.animal.Cat;
import Java_Post_Advanced2.CH01_Generic.animal.Dog;

public class WildCardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printWildcardV1(dogBox);

        WildCardEx.printGenericV2(dogBox);
        WildCardEx.printWildCardV2(dogBox);

        Dog dog = WildCardEx.printAndReturn(dogBox);
        Animal animal = WildCardEx.printAndReturnWildcard(dogBox); // printAndReturnWildcard 함수의 반환 타입이 Animal이기 때문에 Animal로 받음
    }
}
