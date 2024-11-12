package OOP_Inter.Poly;

public class 합계계산 {

    public int 더하기 (int 값1, int 값2) {
        return 값1 + 값2;
    }

    // 메서드 오버로딩 : 메서드명은 같으나 매개변수와 반환값이 다른 메서드가 여러 개 정의
    public int 더하기(int 값1, int 값2, int 값3) {
        return 값1 + 값2 + 값3;
    }

    public long 더하기(int[] 값, int 값개수) {
        long sum = 0;
        for (int i = 0; i < 값개수; i++) {
            sum += 값[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        합계계산 계산1 = new 합계계산();

        System.out.println(계산1.더하기(10, 20));
        System.out.println(계산1.더하기(10, 20, 30));
        System.out.println(계산1.더하기(new int[] {10, 20, 30, 40, 50}, 5)); // 배열 변수 선언 안하고 값 대입해서 전달만
    }
}
