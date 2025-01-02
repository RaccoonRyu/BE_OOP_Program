package Java_Post_Advanced2.CH01_Generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        // 로우 타입 : 다이아몬드를 빼고(제네릭 정보 없이) 제네릭 클래스의 객체 생성
        // 이 경우 생성 시 내부의 타입 매개변수가 Object로 결정된다.
        GenericBox integerBox = new GenericBox();
        integerBox.set(10);
        Object obj = integerBox.get();
        // 로우 타입을 사용하면 잘못된 캐스팅으로 예외가 발생할 확률이 매우 높다.
        // 따라서 사용을 가급적 지양해야한다.
    }
}
