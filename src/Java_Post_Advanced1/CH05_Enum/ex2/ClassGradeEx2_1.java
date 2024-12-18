package Java_Post_Advanced1.CH05_Enum.ex2;

public class ClassGradeEx2_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        // discount() 호출 시 미리 정의한 ClassGrade의 상수를 전달한다.
        // 따라서 잘못된 값을 전달하는 경우가 없어진다!
        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
