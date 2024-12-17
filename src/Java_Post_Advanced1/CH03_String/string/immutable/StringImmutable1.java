package Java_Post_Advanced1.CH03_String.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat("java");
        System.out.println("str = " + str); // 그대로 hello 출력 -> 불변 객체이기 때문!!
    }
}
