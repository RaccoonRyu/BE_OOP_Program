package Java_Post_Advanced2.CH01_Generic.ex2;

// Animal을 상속받는 클래스들을 담을 제네릭 클래스
public class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
