package Java_Post_Advanced2.CH01_Generic.ex5;

// 단순 데이터를 넣고 반환할 수 있는 제네릭 타입 Box
public class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
