package Java_Post_Advanced1.CH03_String.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        // 문자열 조작 및 변환 1
        String str = "Hello, Java! Welcome to Java.";

        // substring : 부분 문자열 추출
        System.out.println("인덱스 7부터의 부분 문자열 추출 : " + str.substring(7));
        System.out.println("인덱스 7부터 12까지의 부분 문자열 추출 : " + str.substring(7, 12));

        // concat : 문자열 결합
        System.out.println("문자열 결합 : " + str.concat("!!!"));

        // replace : 문자열 대체
        System.out.println("'Java'를 'World'로 대체 : " + str.replace("Java", "World"));
        System.out.println("첫 번째 'Java'를 'World'로 대체 : " + str.replaceFirst("Java", "World"));
    }
}
