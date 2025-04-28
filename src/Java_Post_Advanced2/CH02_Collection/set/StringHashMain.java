package Java_Post_Advanced2.CH02_Collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    // 문자열 하나를 받아서 해당 문자열에 맞는 고유한 숫자를 계산하는 함수
    static int hashCode(String str) {
        char[] charArray = str.toCharArray(); // 문자열을 char 배열로 변경
        int sum = 0;
        for (char c : charArray) {
            sum += c; // 문자열을 구성하는 각 문자의 아스키 코드 값을 더한다.
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }

    public static void main(String[] args) {
        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + (int) charB); // char는 int로 캐스팅 시 아스키 코드값으로 출력된다.

        // String
        System.out.println("hashCode(\"A\") = " + hashCode("A"));
        System.out.println("hashCode(\"B\") = " + hashCode("B"));
        System.out.println("hashCode(\"AB\") = " + hashCode("AB")); // hashCode 함수를 통해 문자열을 구성하는 문자들의 값을 얻는다.

        // hashIndex
        int hashCodeA = hashCode("A");
        int hashIndex = hashIndex(hashCodeA);
        System.out.println("hashIndex('A') = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex('B') = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex('AB') = " + hashIndex(hashCode("AB")));
    }
}
