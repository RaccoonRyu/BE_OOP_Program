package Java_Post_Advanced1.CH03_String.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        // 가변 문자열 StringBuilder
        
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D"); // append : 문자열 추가
        System.out.println("sb = " + sb);

        sb.insert(4, "Java"); // 4번째 index에(특정 위치에) Java라는 문자열을 삽입
        System.out.println("sb = " + sb);

        sb.delete(4, 8); // index 4부터 8까지(특정 범위의) 문자열 삭제
        System.out.println("sb = " + sb);
        
        sb.reverse(); // 문자열 뒤집기
        System.out.println("sb = " + sb);

        // StringBuilder to String
        String str = sb.toString();
        System.out.println("str = " + str);
    }
}
