package Java_Post_Advanced1.CH07_NestedInnerClass.anonymous.ex0;

public class Ex0RefMain {
    public static void hello(String lang) {
        System.out.println("프로그램 시작"); // 변하지 않는 부분
        System.out.println("Hello " + lang); // lang : 변하는 부분
        System.out.println("프로그램 종료"); // 변하지 않는 부분
    }
    // 핵심 : 변하는 부분과 변하지 않는 부분을 분리하고, 변하는 부분을 메서드 내부에 가지고 있는 것이 아니라 외부에서 전달 받는다는 것
    // -> 이를 통해 메서드의 재사용성을 높일 수 있음.

    public static void main(String[] args) {
        hello("Java");
        hello("Spring");
    }

}
