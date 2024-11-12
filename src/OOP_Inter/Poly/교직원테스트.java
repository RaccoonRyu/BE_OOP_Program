package OOP_Inter.Poly;

public class 교직원테스트 {
    public static void main(String[] args) {
        교직원 교직원1 = new 교직원("김사랑", 1111, "패스트캠퍼스", 2222);
        System.out.println("이름 : " + 교직원1.이름);
        System.out.println("번호 : " + 교직원1.get주민번호()); // 1111 출력
        System.out.println("학교명 : " + 교직원1.학교명);
        System.out.println("교원번호 : " + 교직원1.번호);
        System.out.println("=================================");

        사람 사람1 = 교직원1; // 업 캐스팅 (부모 클래스로 형 변환 되는 것)
        System.out.println("이름 : " + 사람1.이름);
        System.out.println("주민번호 : " + 사람1.번호); // 1111 출력 (이미 사람이라는 객체가 해당 번호 정보를 가지고 있으므로)
    }
}
