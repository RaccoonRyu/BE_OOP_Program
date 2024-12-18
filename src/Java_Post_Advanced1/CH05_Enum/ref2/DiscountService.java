package Java_Post_Advanced1.CH05_Enum.ref2;

public class DiscountService {

    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}
