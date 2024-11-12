package OOP_Inter.Poly;

public class 교직원 extends 사람{
    public String 학교명;
    public long 번호; // 사원 번호

    public 교직원(String 이름, long 번호, String 학교명, long 교원번호) {
        super(이름, 번호);
        this.학교명 = 학교명;
        this.번호 = 교원번호;
    }

    public long get교직원번호() {
        return 번호;
    }

    // 남자교직원의 정보를 교직원 타입에 맞게 출력하기 위한 오버라이딩!
    // 메서드명, 리턴타입, 매개변수는 부모클래스의 함수와 동일하게 작성
    // Override 어노테이션으로 메서드에 표시하면 해당 메서드가 수정될 때 에러 발생시켜 알려줌
    @Override
    public void 정보출력() {
        System.out.println("================= [교직원 정보] =================");
        System.out.println("이름 : " + 이름);
        System.out.println("주민번호 : " + super.번호);
        System.out.println("학교명 : " + 학교명);
        System.out.println("교원번호 : " + 번호);
    }
}
