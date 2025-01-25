package Java_Post_Advanced2.CH01_Generic.ex4;

import Java_Post_Advanced2.CH01_Generic.animal.Animal;

// AnimalHospitalV3 의 기능을 제네릭 메서드로 구현
public class AnimalMethod {

    // 타입 매개변수 제한을 통해 Animal의 기능(메서드) 사용
    public static <T extends Animal> void checkUp(T t) {
        System.out.println("동물 이름 : " + t.getName());
        System.out.println("동물 크기 : " + t.getSize());
        t.sound();
    }

    // static 메서드이므로 이제 원본이 없기 때문에 밖에서 비교 대상을 전부 받아옴 (t1, t2)
    public static <T extends Animal> T bigger(T t1, T t2) {
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }
}
