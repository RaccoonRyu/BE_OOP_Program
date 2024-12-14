package Java_Post_Advanced1.CH02_Immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(20);
        System.out.println("obj.getVal() = " + obj.getVal()); // 계산 이후 기존 값은 사라지고, 30 출력
    }
}
