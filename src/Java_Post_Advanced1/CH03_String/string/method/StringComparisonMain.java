package Java_Post_Advanced1.CH03_String.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!"; // 대문자 일부 있음
        String str2 = "hello, java!"; // 전체 소문자
        String str3 = "Hello, World!"; // 그 외 문자열

        // 문자열 비교 method

        // equals, equalsIgnoreCase : 동등성 비교
        System.out.println("str1 equals str2 : " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2 : " + str1.equalsIgnoreCase(str2));

        // compareTo, compareToIgnoreCase : 문자열을 사전적으로 비교
        System.out.println("'b' compare to 'a' : " + "b".compareTo("a")); // b와 a는 사전적으로 뒤로(양수) 하나 차이. 1 반환
        System.out.println("'a' compare to 'b' : " + "a".compareTo("b")); // a와 b는 사전적으로 앞으로(음수) 하나 차이. -1 반환
        System.out.println("'c' compare to 'a' : " + "c".compareTo("a")); // c와 a는 사전적으로 뒤로(양수) 둘 차이. 2 반환
        System.out.println("str1 compareTo str3 : " + str1.compareTo(str3));
        System.out.println("str1 compareTo str2 : " + str1.compareToIgnoreCase(str2));

        // startWith, endsWith : 대상 문자열이 특정 문자열로 시작하는지(끝나는지)
        System.out.println("str1 start with 'Hello' : " + str1.startsWith("Hello"));
        System.out.println("str1 end with 'Java!' : " + str1.endsWith("Java!"));
    }
}
