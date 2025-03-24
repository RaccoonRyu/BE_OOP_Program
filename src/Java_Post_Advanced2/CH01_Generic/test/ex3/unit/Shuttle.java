package Java_Post_Advanced2.CH01_Generic.test.ex3.unit;

public class Shuttle<T extends BioUnit> { // 제네릭 타입으로 Shuttle 클래스 작성.
    // 추후 BioUnit의 getName() 메서드 사용을 위해 상한 추가

    private T unit;

    public void in(T t) {
        unit = t;
    }

    public T out() {
        return unit;
    }

    public void showInfo() {
        System.out.println("이름 : " + unit.getName() + ", HP : " + unit.getHp());
    }
}
