package OOP_Inter.Poly;

public class 사무직원 extends 교직원{
   public String 부서;

   public 사무직원(String 이름, long 번호, String 학교명, long 교직원번호, String 부서) {
       super(이름, 번호, 학교명, 교직원번호);
       this.부서 = 부서;
   }

    @Override
    public void 정보출력() {
        System.out.println("================= [사무직원 정보] =================");
        System.out.println("이름 : " + 이름);
        System.out.println("주민번호 : " + get주민번호()); // 사무직원은 사람을 상속받은 것이 아니기 때문에 super가 아님에 주의!
        System.out.println("학교명 : " + 학교명);
        System.out.println("교원번호 : " + 번호);
        System.out.println("부서 : " + 부서);
    }
}
