package Java_Post_Advanced1.CH04_String.string.ex;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        System.out.println("file name : " + str.substring(0, str.indexOf(ext)));
        System.out.println("ext name : " + str.substring(str.indexOf(ext)));
    }
}
