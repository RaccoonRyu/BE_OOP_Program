package OOP_Inter.Poly;

public class instanceof테스트 {
    public static void main(String[] args) {
        사람 남자 = new 사람("홍길동", 1111);
        교직원 남자교직원 = new 교직원("홍길동", 1111, "패스트캠퍼스", 22222);

        // 남자 -> 사람
        // 남자교직원 -> 교직원, 사람
        // A instanceof B : A를 B로 형 변환이 가능한지를 판단하는 연산자
        System.out.println("남자 instanceof 사람 : " + (남자 instanceof 사람));
        System.out.println("남자 instanceof 사람 : " + (남자 instanceof 교직원)); // 남자는 교직원의 instance가 아님!
        System.out.println("남자 instanceof 사람 : " + (남자교직원 instanceof 사람));
        System.out.println("남자 instanceof 사람 : " + (남자교직원 instanceof 교직원));

    }
}
