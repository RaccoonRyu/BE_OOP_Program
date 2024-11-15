package OOP_Advanced.Generic;

public class Generic_Box<T> {

    private T data;

    public void setBox(T data) {
        this.data = data;
    }

    public T getBox() {
        return data;
    }
}
