package Java_Post_Advanced1.CH03_String.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valueOf : 다른 자료형을 문자열로 변환
        String numStr = String.valueOf(num);
        System.out.println("숫자의 문자열 값 = " + numStr);
        String boolStr = String.valueOf(bool);
        System.out.println("불리언의 문자열 값 = " + boolStr);
        String objStr = String.valueOf(obj);
        System.out.println("Object의 문자열 값 = " + objStr);

        // 문자열 + 다른 자료형 = 문자열
        String numStr2 = "" + num;
        System.out.println("빈 문자열 + num = " + numStr2);

        // toCharArray : 문자열을 char 배열로 변환
        char[] strCharArr = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환 : " + strCharArr);
        for (char c : strCharArr) {
            System.out.print(c);
        }
        System.out.println();
    }
}
