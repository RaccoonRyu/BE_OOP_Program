package Java_Post_Advanced1.CH07_NestedInnerClass.nested;

public class NestedOuter {
    private static int outClassVal = 3;
    private int outInstanceVal = 2;

    // 정적 중첩 클래스 작성
    // 바깥 클래스와 서로 관계가 없음
    static class Nested {
        // 멤버 변수
        private int nestedInstanceVal = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceVal);

            // 바깥 클래스의 인스턴스 멤버에 접근 불가
            //System.out.println(outInstanceVal); // 컴파일 에러 발생

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private도 접근 가능
            // private 접근 제어자는 같은 클래스 안에 있을 때만 접근할 수 있다.
            // 중첩 클래스도 바깥 클래스와 같은 클래스 안에 있으므로, 중첩 클래스는 바깥 클래스의 private 접근 제어자에 접근할 수 있다.
            System.out.println(outClassVal);
        }
    }
}
