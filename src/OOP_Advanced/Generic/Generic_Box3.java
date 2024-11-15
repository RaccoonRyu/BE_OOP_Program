package OOP_Advanced.Generic;

public class Generic_Box3<K, V> {

    private K name;
    private V age;

    public void setData(K name, V age) {
        this.name = name;
        this.age = age;
    }

    public K getName() {
        return name;
    }
    public V getAge() {
        return age;
    }
}
