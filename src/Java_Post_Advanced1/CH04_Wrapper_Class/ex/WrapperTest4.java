package Java_Post_Advanced1.CH04_Wrapper_Class.ex;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        Integer integer1 = Integer.valueOf(str);
        int intValue = integer1;
        Integer integer2 = intValue;

        System.out.println("integer1 = " + integer1);
        System.out.println("intValue = " + intValue);
        System.out.println("integer2 = " + integer2);
    }
}
