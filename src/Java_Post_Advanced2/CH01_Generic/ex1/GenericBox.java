package Java_Post_Advanced2.CH01_Generic.ex1;

// 클래스를 정의할 때 제네릭을 사용하기 위해 클래스명 옆에 <T(타입)> 기재
// 이렇게 다이아몬드(<타입>)를 사용한 클래스를 제네릭 클래스라고 한다.
// 이 때 다이아몬드 안의 T를 타입 매개변수라고 한다. (추후 Integer나 String 등으로 변할 수 있음)
public class GenericBox<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
