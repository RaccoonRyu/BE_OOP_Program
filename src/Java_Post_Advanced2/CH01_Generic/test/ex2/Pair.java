package Java_Post_Advanced2.CH01_Generic.test.ex2;

// 제네릭은 타입 매개변수를 여러 개 사용할 수 있다.
public class Pair<K, V> {

    private K key;
    private V value;

    public K getFirst() {
        return key;
    }

    public V getSecond() {
        return value;
    }

    public void setFirst(K key) {
        this.key = key;
    }

    public void setSecond(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
