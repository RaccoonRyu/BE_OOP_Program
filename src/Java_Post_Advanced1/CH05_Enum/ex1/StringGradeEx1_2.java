package Java_Post_Advanced1.CH05_Enum.ex1;

public class StringGradeEx1_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 여전히 존재하지 않는 등급 입력 문제
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        // 오타 입력 문제
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액: " + vip);

        // 소문자 입력 문제
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액: " + gold);

        // 문자열 상수를 사용해도, 파라미터에 어떤 문자열이든 입력할 수 있기 때문에
        // 실수로 StringGrade에 있는 문자열 상수를 사용하지 않는 문제가 발생한다.
    }
}
