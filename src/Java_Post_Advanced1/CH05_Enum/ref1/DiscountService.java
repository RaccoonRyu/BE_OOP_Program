package Java_Post_Advanced1.CH05_Enum.ref1;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        // 회원 등급 클래스가 할인율을 관리하기 때문에 단순 할인율 계산 로직만 남음
        return price * classGrade.getDiscountPercent() / 100;
    }
}
