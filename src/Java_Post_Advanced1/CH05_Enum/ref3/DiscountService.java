package Java_Post_Advanced1.CH05_Enum.ref3;

public class DiscountService {

    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}
