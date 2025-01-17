package Java_Post_Advanced2.CH01_Generic.ex3;


import Java_Post_Advanced2.CH01_Generic.animal.Cat;
import Java_Post_Advanced2.CH01_Generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospitalV2 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospitalV2 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospitalV2 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospitalV2 = new AnimalHospitalV2<>();
        // 제네릭을 사용하면 타입 인자에 개, 고양이 말고도 동물과 관계 없는 타입들이 들어올 수 있다.
        // 따라서 타입 매개변수에도 제한이 필요하다.
    }
}
