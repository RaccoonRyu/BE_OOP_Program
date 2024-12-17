package Java_Post_Advanced1.CH04_String.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        // 문자열 조작 및 변환 2
        String strWithSpaces = "    Java Programming    ";

        // 대, 소문자로 변환
        System.out.println("대문자로 변환 : " + strWithSpaces.toUpperCase());
        System.out.println("소문자로 변환 : " + strWithSpaces.toLowerCase());

        // 공백 제거
        System.out.println("공백 제거(trim) : " + strWithSpaces.trim()); // 문자열 양쪽 끝의 단순 공백 제거
        System.out.println("공백 제거(strip) : " + strWithSpaces.strip()); // 단순 공백과 유니코드 공백 모두 제거
        System.out.println("앞 공백 제거(strip) : " + strWithSpaces.stripLeading());
        System.out.println("뒤 공백 제거(strip) : " + strWithSpaces.stripTrailing());
    }
}
