package Java_Post_Advanced1.CH04_String.string.chaining;

public class ValueAdder {

    private int value;

    public ValueAdder add(int addVal) {
        value += addVal;
        return this; // 자기 자신의 참조값 반환
    }

    public int getValue() {
        return value;
    }
}
