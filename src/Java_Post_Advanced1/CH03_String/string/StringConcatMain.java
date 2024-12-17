package Java_Post_Advanced1.CH03_String.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b); // Java에서 문자열을 더할 때는 String이 제공하는 concat()과 같은 메서드를 사용해야 함
        String result2 = a + b; // 허나 문자열은 너무 자주 다뤄지기 때문에 Java에서 편의상 + 연산을 제공한다.
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
