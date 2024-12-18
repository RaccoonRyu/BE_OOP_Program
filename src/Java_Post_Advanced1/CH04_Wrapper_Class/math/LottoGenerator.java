package Java_Post_Advanced1.CH04_Wrapper_Class.math;

import java.util.Random;

// 로또 번호 자동 생성기
public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        // 로또 번호 6개 뽑을 때 까지 반복
        while (count < 6) {
            // 1 ~ 45 사이 숫자 생성
            int num = random.nextInt(45) + 1;

            // 중복되지 않은 경우만 배열에 추가
            if(isUnique(num)) {
                lottoNumbers[count] = num;
                count++;
            }
        }

        return lottoNumbers;
    }

    // 기 생성된 번호와 중복 검사
    private boolean isUnique(int num) {
        for (int i = 0; i < count; i++) {
            if(lottoNumbers[i] == num) {
                return false;
            }
        }
        return true;
    }
}
