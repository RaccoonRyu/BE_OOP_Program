package Java_Post_Advanced1.CH03_String.string;

public class StringBasicMain {
    public static void main(String[] args) {
        // String은 참조형 자료형이다.
        String str1 = "hello";
        String str2 = new String("hello"); // 따라서 문자열도 객체를 생성할 수 있다

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
