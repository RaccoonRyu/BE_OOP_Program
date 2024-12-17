package Java_Post_Advanced1.CH04_String.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교 : " + (str1 == str2));
        System.out.println("new String() equals 비교 : " + (str1.equals(str2)));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교 : " + (str3 == str4)); // 문자열 리터럴을 사용하는 경우 같은 참조값을 가지므로 == 비교 성공
        System.out.println("리터럴 equals 비교 : " + (str3.equals(str4)));

        // 문자열 리터럴을 그대로 사용하는 경우 문자열 풀을 사용함
        // 코드가 로딩될 때 코드에 문자열 리터럴(ex "문자열")이 있으면 문자열 풀에 미리 String 인스턴스를 만들고, 같은 문자열이 여러 개 있으면 하나만 만든다.
    }
}
