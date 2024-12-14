package Java_Post_Advanced1.CH02_Immutable.ex;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1; // 여기까지는 date1과 date2의 참조값 동일
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        date1 = date1.withYear(2025); // date1에 새로운 객체 반환(date2와 참조값 다름)
        // 본인의 값을 기반으로 새로운 값을 가지고 새 객체를 만들어서 반환
        System.out.println("date1 = " + date1); // 2025년
        System.out.println("date2 = " + date2); // 2024년
    }
}
