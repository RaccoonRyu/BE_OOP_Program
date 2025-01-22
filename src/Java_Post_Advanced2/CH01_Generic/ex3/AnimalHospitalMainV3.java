package Java_Post_Advanced2.CH01_Generic.ex3;

import Java_Post_Advanced2.CH01_Generic.animal.Cat;
import Java_Post_Advanced2.CH01_Generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        // 제네릭 타입 사용
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        // 문제 1 : 개 병원에 고양이를 전달하면? -> 해결
        //dogHospital.set(cat); // 제네릭에 타입 매개변수 제한을 사용하기 때문에 다른 타입을 입력하면 컴파일 오류 발생

        // 문제 2 : 개 타입을 반환 -> 해결
        // 이전에는 강제로 다운 캐스팅이 수반되었지만, 이제는 제네릭에 타입 매개변수 제한을 사용하여 Dog가 확실히 들어감을 확인할 수 있기 때문에 다운 캐스팅 필요 없음.
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog); // 멍멍이 2 출력

        // 제네릭에 타입 매개변수 제한을 사용해서 타입 안전성 문제와 코드 재사용 문제를 해결했다!
    }
}
