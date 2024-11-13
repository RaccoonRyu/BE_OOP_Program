package OOP_Inter.Interface;

public class 특전사 extends 군인 implements IBS, 대테러진압 {

    @Override
    public void 구보() {
        System.out.println("특전사가 구보를 한다!");
    }

    @Override
    public void headCarry() {
        System.out.println("그냥 헤드 캐리 함");
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

}
