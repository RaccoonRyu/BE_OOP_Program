package Java_Post_Advanced1.CH04_String.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        // 문자열 분할 및 조합
        String str = "Apple,Banana,Orange";

        // split() : 정규표현식 기준으로 문자열 분할
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }
        
        // join() : 특정 기호를 사용하여 분리된 문자열 조합
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("joinedStr = " + joinedStr);

        // 문자열 배열 연결
        String result = String.join("-", split);
        System.out.println("result = " + result);
    }
}
