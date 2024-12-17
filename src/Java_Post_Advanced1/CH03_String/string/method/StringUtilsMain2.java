package Java_Post_Advanced1.CH03_String.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        // format : 문자열의 형태(포맷)를 바꾸는 것
        // %d : 숫자, %b : 불리언, %s : 문자열
        String format1 = String.format("num : %d, , bool : %b, String : %s", num, bool, str);
        System.out.println("format1 = " + format1);

        String format2 = String.format("숫자 : %.2f", 10.1234); // 소수 둘째자리까지만 출력(%.2f)
        System.out.println("format2 = " + format2);

        // printf : 출력과 동시에 문자열의 형태(포맷)을 바꾸는 것
        System.out.printf("숫자 : %.2f\n", 10.1234); // 소수 둘째자리까지만 출력(%.2f)

        // matches : 문자열과 정규 표현식이 매칭(일치)하는지 확인
        String regex = "Hello, (Java!|World)"; // Hello, 뒷 부분이 Java! or World인 정규 표현식
        System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));
    }
}
