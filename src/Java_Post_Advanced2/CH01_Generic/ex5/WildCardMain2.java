package Java_Post_Advanced2.CH01_Generic.ex5;

import Java_Post_Advanced2.CH01_Generic.animal.Animal;
import Java_Post_Advanced2.CH01_Generic.animal.Cat;
import Java_Post_Advanced2.CH01_Generic.animal.Dog;

// 하한 와일드 카드 예제
public class WildCardMain2 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입을 메서드에 전달 가능
        writeBox(objectBox);
        writeBox(animalBox);
        //writeBox(dogBox);
        //writeBox(catBox); // 하한이 Animal -> dog, catBox는 Animal보다 하위 타입이므로 컴파일 에러 발생

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }

    static void writeBox(Box<? super Animal> box) { // super : 입력받을 ?가 Animal 자신이거나 Animal보다 상위 타입이어야 함 (최소한[하한] Animal)
        box.set(new Dog("멍멍이", 100));
    }
}
