package Java_Post_Advanced1.CH05_Enum.ref1;

// 화원 등급에 할인율이 따라오도록 회원 등급 클래스에 할인율 관리하도록 변경
public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(10); //x001
    public static final ClassGrade GOLD = new ClassGrade(20); //x002
    public static final ClassGrade DIAMOND = new ClassGrade(30); //x003

    private final int discountPercent;

    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
