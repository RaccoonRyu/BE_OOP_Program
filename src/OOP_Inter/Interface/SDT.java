package OOP_Inter.Interface;

// 추상클래스 하나와 여러 개의 인터페이스 상속
// 상속받은 요소들의 (추상) 메서드들은 모두 구현이 필요하다.
public class SDT extends 군인 implements IBS, 대테러진압, 데스매치 {

    @Override
    public void 구보() {
        System.out.println("SDT가 구보를 한다!");
    }

    @Override
    public void headCarry() {
        System.out.println("약간 엉성하게 헤드 캐리 함");
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
        System.out.println("행군하기!!!!!");
    }
}
