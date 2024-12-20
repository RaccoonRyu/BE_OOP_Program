package Java_Post_Advanced1.CH05_Enum.ref3;

public class DiscountService {

    public int discount(Grade grade, int price) {
        // 할인율 계산은 Grade가 스스로 처리하므로 discount()를 호출하기만 하면 된다.
        return grade.discount(price);
    }
}
