package Java_Post_Advanced1.CH07_NestedInnerClass.nested;

// 같은 이름의 바깥 변수 접근
public class ShadowingMain {
    public int value = 1;
    
    class Inner {
        public int value = 2;

        void go() {
            int value = 3;
            System.out.println("value = " + value); // 지역 변수
            System.out.println("this.value = " + this.value); // 내부 클래스의 멤버 변수
            System.out.println("ShadowingMain.this.value = " + ShadowingMain.this.value); // 외부 클래스의 멤버 변수
        }
    }

    public static void main(String[] args) {
        ShadowingMain shadowingMain = new ShadowingMain();
        Inner inner = shadowingMain.new Inner();
        inner.go();

        // 변수의 이름이 같기 때문에 어떤 변수를 먼저 사용할지 우선순위가 필요
        // 이 때 프로그래밍에서 우선 순위는 보통 더 가깝거나, 더 구체적인 것이 우선권을 갖는다. (사람이 직관적으로 이해하기 쉬운 방향)
        // 따라서 메서드 go()의 경우 지역 변수 value가 제일 가깝고 우선순위가 가장 높다.
        // -> 다른 이름이 같은 변수들을 가려서 보이지 않게 하는 것 : 섀도잉(Shadowing)

        // 다른 변수를 가리더라도 인스턴스의 참조를 사용하면 (외부의) 변수에 접근할 수 있다.
        // this.value = 내부 클래스의 인스턴스 / 바깥클래스명.this = 바깥 클래스의 인스턴스에 접근
    }
}
