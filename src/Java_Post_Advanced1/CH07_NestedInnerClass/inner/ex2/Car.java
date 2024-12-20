package Java_Post_Advanced1.CH07_NestedInnerClass.inner.ex2;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        // 바깥 클래스에서 내부 클래스의 인스턴스를 생성할 때는 바깥 클래스명을 생략할 수 있다.
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    // Engine은 Car의 내부 클래스이기 때문에 별도의 Car 정보가 필요하지 않고 바로 외부 Car 정보에 접근할 수 있다.
    // 내부 클래스는 바깥 클래스의 인스턴스에 접근할 수 있기 떄문.
    private class Engine {

        public void start() {
            System.out.println("충전 레벨 확인 : " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}
