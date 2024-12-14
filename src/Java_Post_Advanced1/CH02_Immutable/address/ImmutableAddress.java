package Java_Post_Advanced1.CH02_Immutable.address;

public class ImmutableAddress {
    private final String val;

    public ImmutableAddress(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "Address{" +
                "val='" + val + '\'' +
                '}';
    }
}
