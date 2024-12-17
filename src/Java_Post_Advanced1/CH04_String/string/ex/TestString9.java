package Java_Post_Advanced1.CH04_String.string.ex;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] splitEmail = email.split("@");
        System.out.println("ID : " + splitEmail[0]);
        System.out.println("Domain : " + splitEmail[1]);
    }
}
