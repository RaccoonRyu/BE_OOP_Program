package OOP_Inter.Poly;

public class 다운캐스팅테스트 {
    public static void main(String[] args) {
        /*사람 남자 = new 사람("홍길동", 1111);
        System.out.println("이름 : " + 남자.이름);
        System.out.println("주민번호 : " + 남자.번호);
        System.out.println("=======================================");

        // 명시적 형변환을 통한 다운 캐스팅 실패 사례
        교직원 교직원1 = (교직원) 남자;
        System.out.println("학교명 : " + 교직원1.학교명); // 사람을 교직원으로 다운캐스팅하였지만 근본이 사람이므로 실행시 오류 발생*/

        교직원 남자교직원 = new 교직원("홍길동", 1111, "패스트캠퍼스", 22222);
        System.out.println("이름 : " + 남자교직원.이름);
        System.out.println("주민번호 : " + ((사람) 남자교직원).번호); // 남자교직원.get주민번호() 대신 사람으로 업캐스팅한 다음 번호(주민번호)를 출력
        System.out.println("학교명 : " + 남자교직원.학교명);
        System.out.println("교원번호 : " + 남자교직원.번호);
        System.out.println("========================================");

        // 교직원 -> 사람 업 캐스팅
        사람 남자사람 = 남자교직원;
        System.out.println("이름 : " + 남자사람.이름);
        System.out.println("주민번호 : " + 남자사람.번호);
        System.out.println("========================================");

        // 다운 캐스팅의 진의 -> 원래 근본이 더 하위클래스인 교직원이므로, 업 캐스팅 이후 다시 다운 캐스팅해야 정상적으로 실행됨
        교직원 남자교직원2 = (교직원) 남자사람;
        System.out.println("이름 : " + 남자교직원2.이름);
        System.out.println("주민번호 : " + ((사람) 남자교직원2).번호);
        System.out.println("학교명 : " + 남자교직원2.학교명);
        System.out.println("교원번호 : " + 남자교직원2.번호); // 다운 캐스팅 후 교직원 정보를 정상적으로 출력 가능
        System.out.println("========================================");
    }
}
