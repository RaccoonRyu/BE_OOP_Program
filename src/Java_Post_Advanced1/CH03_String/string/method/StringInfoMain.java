package Java_Post_Advanced1.CH03_String.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello, Java!";

        // 문자열 정보 확인 method
        System.out.println("문자열의 길이 : " + str.length());
        System.out.println("문자열의 비어있음 확인 : " + str.isEmpty());
        System.out.println("문자열의 비어있음과 공백 확인 1 : " + str.isBlank());
        System.out.println("문자열이 비어있음과 공백 확인 2 : " + "                ".isBlank());

        char c = str.charAt(7);
        System.out.println("7번 인덱스의 문자 = " + c);

    }
}
