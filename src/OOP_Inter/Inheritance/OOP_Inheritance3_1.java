package OOP_Inter.Inheritance;

import java.util.Calendar;

class 저축계좌 extends 계좌 {
    public void 값설정() {
        이름 = "저축계좌";
        개설일 = Calendar.getInstance().getTime();
        계좌번호 = 12345;
        // super.금액 = 1000; // 역시나 private이기 때문에 접근 불가(에러)
    }
}

public class OOP_Inheritance3_1 {
    public static void main(String[] args) {
        계좌 계좌1 = new 계좌();
        계좌1.이름 = "은행계좌";
        계좌1.개설일 = Calendar.getInstance().getTime();
        계좌1.계좌번호 = 12345;
        //계좌1.금액 = 1000; // private이기 때문에 접근 불가(에러)
    }
}
