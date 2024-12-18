package OOP_Inter.Poly;

public class 사무직원테스트 {
    public static void main(String[] args) {
        사람 남자 = new 사람("홍길동", 1111);
        System.out.println("이름 : " + 남자.이름 + ", 주민번호 : " + 남자.번호);
        System.out.println("================================================");

        교직원 일잘하는교직원 = new 교직원("박하은", 2222, "패스트캠퍼스", 33333);

        // 사람으로 업 캐스팅
        // 교직원으로 생성했지만 사람으로 업캐스팅했으므로 아래와 같이 작성 가능
        사람 여자 = 일잘하는교직원;
        System.out.println("이름 : " + 여자.이름);
        System.out.println("주민번호 : " + 여자.번호);
        //System.out.println("학교명 : " + 여자.학교명); // 학교명은 사람이 아니라 교직원의 정보이기 때문에 출력안됨
        System.out.println("학교명 : " + 일잘하는교직원.학교명);
        System.out.println("교원번호 : " + 일잘하는교직원.번호); // 교직원으로는 해당 정보 출력 가능
        System.out.println("=================================================");

        사무직원 열심히일하는사무직원 = new 사무직원("박하영", 4444, "패스트캠퍼스", 55555, "경영지원");
        // 사람으로 업 캐스팅
        사람 사람3 = 열심히일하는사무직원; // 사무직원 -> 사람 업 캐스팅 (두단계 위 가능)
        교직원 교직원3 = 열심히일하는사무직원; // 사무직원 -> 교직원 업 캐스팅 (한단계 위)

        System.out.println("이름 : " + 사람3.이름);
        System.out.println("주민번호 : " + 사람3.번호); // 여기까지 사람 업캐스팅 표현 가능 정보

        System.out.println("학교명 : " + 교직원3.학교명);
        System.out.println("교원번호 : " + 교직원3.번호); // 여기까지 교직원 업캐스팅 표현 가능 정보

        System.out.println("부서 : " + 열심히일하는사무직원.부서); // 사무직원에서 표현 가능 정보 (사람, 교직원에서는 표현 불가)
    }
}
