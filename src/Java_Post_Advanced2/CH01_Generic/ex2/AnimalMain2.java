package Java_Post_Advanced2.CH01_Generic.ex2;

import Java_Post_Advanced2.CH01_Generic.animal.Animal;
import Java_Post_Advanced2.CH01_Generic.animal.Cat;
import Java_Post_Advanced2.CH01_Generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물1", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);

        // Animal 타입을 상속받은 자식인 Dog, Cat도 전달하고 꺼낼 수 있다. (타입은 애니멀)
        animalBox.set(dog);
        animalBox.set(cat);
        
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal); // 야옹이
    }
}
