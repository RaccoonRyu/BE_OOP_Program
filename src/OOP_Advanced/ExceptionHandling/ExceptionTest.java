package OOP_Advanced.ExceptionHandling;

public class ExceptionTest {
    public static void main(String[] args) {
        int[] ints = {10, 20};

        //System.out.println(ints[3]); // 에러 발생 java.lang.ArrayIndexOutOfBoundsException: 3

        // 예외 처리 방법
        // 1. 내가 try catch 한다.
        // 2. 호출한 곳에 throws 한다.

        // 1번 해결 방법을 사용
        try { // 예외를 발생시킬 수 있는 코드(exception checked)를 try 블럭 안에 작성
            Class.forName("abc");
        } catch (Exception e) { // try 블럭 안에서 발생한 예외를 처리 (직접 처리)
            e.printStackTrace();
        }

    }
}
