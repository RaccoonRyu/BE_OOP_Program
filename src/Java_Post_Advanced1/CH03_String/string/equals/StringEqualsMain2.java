package Java_Post_Advanced1.CH03_String.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교 1 : " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교 2 : " + isSame(str3, str4));
    }

    private static boolean isSame (String x, String y) {
        // 문자열이 파라미터로 넘어올 때 문자열 풀에서 넘어오는지 새로 생성한 문자열이 넘어오는지 확인할 수 없음
        // 따라서 항상 문자열 비교는 equals로 수행해야 한다. (절대 == 비교하면 안됨!)
        //return x == y;

        return x.equals(y);
    }
}
