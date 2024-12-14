package Java_Post_Advanced1.CH02_Immutable.change;

public class ImmutableObj {

    private final int val;

    public ImmutableObj(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    // 기존 불변 객체의 값에 변경할 값을 더하고, 해당 값을 이용해 불변 객체 자체를 새로 생성하여 반환
    // 즉, 원래 자기 자신의 값을 절대 바꾸지 않고 자신의 값을 변경해야한다면 그냥 변경한 값으로 새로운 객체를 만들어 반환하는 것.
    public ImmutableObj add(int addVal) {
        int result = val + addVal;
        return new ImmutableObj(result);
    }
}
