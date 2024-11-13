package OOP_Inter.Interface;

// 추상클래스 군인을 상속받은 UDT
public class UDT extends 군인 implements IBS, 대테러진압, 데스매치 {
    // 군인의 메서드를 필수적으로 구현해야함
    @Override
    public void 구보() {
        System.out.println("UDT가 구보를 한다!");
    }

    @Override
    public void headCarry() {
        System.out.println("겁나 멋지게 헤드 캐리 함");
    }

    @Override
    public void 보트진수() {

    }

    @Override
    public void 사격하기() {

    }

    @Override
    public void 인질구조() {

    }

    @Override
    public void 완전군장하기() {

    }

    @Override
    public void 행군하기() {
        System.out.println("뛰어서 행군하기!!!!!");
    }
}
