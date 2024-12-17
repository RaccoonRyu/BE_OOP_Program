package Java_Post_Advanced1.CH04_String.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        // 가변 문자열 StringBuilder

        // 메서드 체이닝 사용
        StringBuilder sb = new StringBuilder();
        String str = sb.append("A").append("B").append("C").append("D")
                .insert(4, "Java")
                .delete(4, 8)
                .reverse()
                .toString();

        System.out.println("str = " + str);
    }
}
