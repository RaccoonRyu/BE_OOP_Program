package OOP_Inter.Interface;

// 인터페이스는 implements로 상속받는다.
// 클래스와 달리 다중 상속이 가능하다.
public class 엘지리모콘 implements 리모콘, 전화기능 {

    // 인터페이스를 상속 받으면, 인터페이스 안의 메서드는 반드시 구현해주어야 한다.
    @Override
    public void 전원켜기() {
        System.out.println("엘지 티비의 전원을 켭니다.");
    }

    @Override
    public void 전원끄기() {
        System.out.println("엘지 티비의 전원을 끕니다.");
    }

    @Override
    public void 전화받기() {
        System.out.println("전화를 받습니다.");
    }
}
