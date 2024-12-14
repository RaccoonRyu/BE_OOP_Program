package Java_Post_Advanced1.CH02_Immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);
        // 불변 객체에서 변경과 관련된 메서드들은 보통 객체를 새로 만들어서 반환하기 때문에 꼭! 반환 값을 받아야 한다.

        // 계산 이후에도 기존 객체의 값과 신규 객체의 값 모두 확인 가능
        System.out.println("obj1 = " + obj1.getVal()); // 10
        System.out.println("obj2 = " + obj2.getVal()); // 30
    }
}
