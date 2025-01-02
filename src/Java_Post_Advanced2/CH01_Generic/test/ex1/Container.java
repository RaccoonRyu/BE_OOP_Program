package Java_Post_Advanced2.CH01_Generic.test.ex1;

public class Container<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public boolean isEmpty() {
        return item == null;
    }
}
