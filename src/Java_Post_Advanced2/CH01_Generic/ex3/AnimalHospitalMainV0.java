package Java_Post_Advanced2.CH01_Generic.ex3;

import Java_Post_Advanced2.CH01_Generic.animal.Cat;
import Java_Post_Advanced2.CH01_Generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        // 문제 1 : 개 병원에 고양이를 전달하면?
        //dogHospital.set(cat); // 다른 타입을 입력하면 컴파일 오류 발생 - 타입 안전성이 명확하게 지켜진다.

        // 문제 2 : 개 타입을 반환 - 고양이 병원과 중복되는 코드가 많아 코드 재사용은 되지 않는다.
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog); // 멍멍이 2 출력
    }
}
