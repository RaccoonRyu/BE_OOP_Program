package Java_Post_Advanced1.CH04_String.string.ex;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("sb = " + reversed);
    }
}
