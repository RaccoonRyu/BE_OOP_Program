package Java_Post_Advanced1.CH04_Wrapper_Class;

public class MyInteger {

    private final int val;

    public MyInteger(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public int compareTo(int target) {
        if (val < target) {
            return -1;
        } else if (val > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}
