package Java_Post_Advanced1.CH04_Wrapper_Class.math;

import java.util.Arrays;

public class LottoMain {
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNums = generator.generate();
        Arrays.sort(lottoNums);

        // 생성된 로또 번호 출력
        System.out.print("로또 번호 : ");
        for (int lottoNum : lottoNums) {
            System.out.print(lottoNum + " ");
        }
    }
}
