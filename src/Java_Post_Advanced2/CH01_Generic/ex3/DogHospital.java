package Java_Post_Advanced2.CH01_Generic.ex3;

import Java_Post_Advanced2.CH01_Generic.animal.Dog;

public class DogHospital {
    private Dog animal;

    public void set(Dog animal) {
        this.animal = animal;
    }

    public void checkUp() {
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public Dog bigger(Dog target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
