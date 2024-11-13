package OOP_Inter.Interface;

public class 리모콘테스트 {
    public static void main(String[] args) {

        // 리모콘 리모콘1 = new 리모콘(); // 인터페이스 또한 객체로 생성 불가

        삼성리모콘 삼성리모콘1 = new 삼성리모콘();
        삼성리모콘1.전원켜기();
        삼성리모콘1.전원끄기();

        엘지리모콘 엘지리모콘1 = new 엘지리모콘();
        엘지리모콘1.전원켜기();
        엘지리모콘1.전원끄기();
        엘지리모콘1.전화받기();
    }
}
