package Java_Post_Advanced1.CH05_Enum.ref2;

public class DiscountService {

    public int discount(Grade grade, int price) {
        // 역시나 Enum에서 상수에 해당하는 할인율을 관리하기 때문에 단순한 할인율 계산 로직만 남았다.
        return price * grade.getDiscountPercent() / 100;
    }
}
