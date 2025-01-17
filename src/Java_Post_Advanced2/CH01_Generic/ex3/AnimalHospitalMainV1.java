package Java_Post_Advanced2.CH01_Generic.ex3;

import Java_Post_Advanced2.CH01_Generic.animal.Cat;
import Java_Post_Advanced2.CH01_Generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        // 문제 1 : 개 병원에 고양이를 전달하면?
        dogHospital.set(cat); // 개 병원에 고양이를 넣을 수 있게 된다. -> 매개변수 체크 실패 : 컴파일 오류가 발생하지 않음

        // 문제 2 : 개 타입을 반환 - 이제는 반환 타입이 Animal이기 때문에 컴파일 오류 발생
        // 따라서 강제로 다운 캐스팅이 수반된다. 그리고 만약 실수로 dog가 아닌 cat이 들어간 경우에는 ClassCastException이 발생할 수 있다. (Cat -> Dog 불가)
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog); // 멍멍이 2 출력

        // 코드 재사용성은 늘었으나, 문제 1, 2 에서 보듯 타입 안전성은 지켜지지 않는다.
    }
}
