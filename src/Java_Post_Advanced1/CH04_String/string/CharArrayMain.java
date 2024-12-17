package Java_Post_Advanced1.CH04_String.string;

public class CharArrayMain {
    public static void main(String[] args) {
        // 문자 하나를 담을 수 있는 char
        char a = 'a';
        System.out.println("a = " + a);

        // char로 여러 개의 문자열을 담기 위해서는 char 배열이 필요
        char[] charArrs = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println(charArrs); // println은 캐릭터 배열이 들어오면 배열 요소를 연결해서 출력해줌

        // 문자를 하나씩 다루고 여러 문자를 배열에 넣어 사용하는 것을 피하기 위해 String 도입
        // String을 통해 문자열을 편리하게 다룰 수 있게 되었다.
        String str = "hello";
        System.out.println("str = " + str);
    }
}
