package Java_Post_Advanced2.CH01_Generic.ex3;

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp() {
        // T의 타입을 메서드 정의 시점(컴파일 시점)에는 알 수 없다. 해당 시점에서는 Object의 기능만 사용한다.
        animal.toString();
        animal.equals(null);

        // 따라서 Object의 기능 외에는 모두 컴파일 오류 발생
        /*System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();*/
    }

    public T bigger(T target) {
        /*return animal.getSize() > target.getSize() ? animal : target;*/
        return null;
    }
}
