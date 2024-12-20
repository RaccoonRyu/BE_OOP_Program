package Java_Post_Advanced1.CH05_Enum.ref3;

// Enum 안으로 상수에 맞는 할인율 뿐만 아니라 할인 가격 계산 로직을 추가한다.
// Enum도 클래스이기 때문에, 객체지향 관점에서 Grade 클래스가 자신의 할인율을 어떻게 계산하는지 스스로 관리하는 것이 바람직하다.
public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    // Enum 또한 Class이기 때문에 메서드를 작성할 수 있다.
    // 할인율에 따른 할인가격 계산 로직을 메서드로 작성했다.
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
