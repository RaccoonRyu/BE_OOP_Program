package Java_Post_Advanced2.CH01_Generic.ex3;

import Java_Post_Advanced2.CH01_Generic.animal.Animal;

// 타입 매개변수를 특정 타입으로 제한(Animal)
// <T extends 제한하려는 자료형(타입)> 키워드 사용
// 이렇게하면 여기서 제한한 특정 타입이나 해당 타입의 자식 타입들만 T에 들어갈 수 있다. (T의 상한(최대)이 제한한 타입이 됨)
// 따라서 T는 최소한 Animal 정도의 기능을 사용할 수 있게 된다.
public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    // 이제 Java 컴파일러는 T에 입력될 수 있는 값의 범위를 예측할 수 있다. (Animal)
    // 따라서 Animal이 제공하는 메서드들을 사용할 수 있다.
    public void checkUp() {
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
