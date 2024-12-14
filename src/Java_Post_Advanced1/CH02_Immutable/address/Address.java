package Java_Post_Advanced1.CH02_Immutable.address;

public class Address {
    private String val;

    public Address(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Address{" +
                "val='" + val + '\'' +
                '}';
    }
}
