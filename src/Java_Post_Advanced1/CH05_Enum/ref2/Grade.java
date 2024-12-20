package Java_Post_Advanced1.CH05_Enum.ref2;

// 열거형에 할인율을 관리하도록 작성
public enum Grade {
    BASIC(10),
    GOLD(20),
    DIAMOND(30);
    // ENUM도 Class이기 때문에 상수에 괄호(생성자 인수)를 전달하여 생성자를 사용할 수 있다.

    private final int discountPercent;

    // 열거형은 상수로 지정하는 것 외에 일반적으로 외부 생성이 불가하다.
    // 따라서 생성자에 접근제어자를 선언할 수 없다. (private 이라고 생각하기)
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    // ENUM도 Class이기 때문에 메서드를 추가할 수 있다 (getter)
    public int getDiscountPercent() {
        return discountPercent;
    }

}
