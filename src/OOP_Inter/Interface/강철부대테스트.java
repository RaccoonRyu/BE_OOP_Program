package OOP_Inter.Interface;

public class 강철부대테스트 {
    public static void main(String[] args) {
        SDT sdt = new SDT();
        sdt.구보();
        sdt.행군하기();

        SSU ssu = new SSU();
        ssu.구보();
        ssu.행군하기();

        UDT udt = new UDT();
        udt.구보();
        ssu.행군하기();


        칠공칠 cgc = new 칠공칠();
        cgc.구보();

        특전사 tjs = new 특전사();
        tjs.구보();

        해병수색대 hsd = new 해병수색대();
        hsd.구보();

        // 동일한 인터페이스를 상속받은 클래스들이라면, 해당 인터페이스의 배열로 한번에 정의할 수(담을 수) 있다.
        // 인터페이스를 사용한 다형성
        IBS[] IBSList = {sdt, ssu, udt, cgc, tjs, hsd};

        // 당연하지만 이를 한번에 출력할 수 있다.
        for (int i = 0; i < IBSList.length; i++) {
            IBSList[i].headCarry();
        }

    }
}
