package Java_Post_Advanced2.CH01_Generic.ex3;

import Java_Post_Advanced2.CH01_Generic.animal.Cat;

public class CatHospital {
    private Cat animal;

    public void set(Cat animal) {
        this.animal = animal;
    }

    public void checkUp() {
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public Cat bigger(Cat target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
