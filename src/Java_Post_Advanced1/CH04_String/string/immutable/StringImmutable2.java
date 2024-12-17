package Java_Post_Advanced1.CH04_String.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str = " + str2); // 이제야 hello java 출력 -> 불변 객체이기 때문에 값을 변경하면 이를 통해 새로운 결과를 반환한다!
    }
}
