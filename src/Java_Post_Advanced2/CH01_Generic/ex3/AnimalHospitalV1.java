package Java_Post_Advanced2.CH01_Generic.ex3;

import Java_Post_Advanced2.CH01_Generic.animal.Animal;

public class AnimalHospitalV1 {

    private Animal animal;

    public void set(Animal animal) {
        this.animal = animal;
    }

    public void checkUp() {
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public Animal bigger(Animal target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
