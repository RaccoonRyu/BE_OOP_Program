package Java_Post_Advanced1.CH04_String.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java World.";

        // 문자열 검색 method
        // contains : 대상 문자열에 특정 문자열이 포함되는지
        System.out.println("문자열에 'Java'가 포함되어 있는지 : " + str.contains("Java"));

        // indexOf : 대상 문자열에 특정 문자열이 처음에(혹은 특정 인덱스 이후에) 등장하는 인덱스
        System.out.println("문자열에 'Java'가 처음 등장하는 인덱스 : " + str.indexOf("Java"));
        System.out.println("문자열의 인덱스 10부터 'Java'가 등장하는 인덱스 : " + str.indexOf("Java", 10));

        // lastIndexOf : 대상 문자열에 특정 문자열이 마지막에 등장하는 인덱스
        System.out.println("문자열에 'Java'가 마지막에 등장하는 인덱스 : " + str.lastIndexOf("Java"));

    }
}
