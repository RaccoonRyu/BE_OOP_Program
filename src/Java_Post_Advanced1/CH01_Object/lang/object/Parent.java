package Java_Post_Advanced1.CH01_Object.lang.object;

// 부모가 없으면 묵시적으로 Object 클래스를 상속받는다.
// Java에서 모든 객체의 최종 부모는 Object다.
// Object는 객체라는 개념에서 필요한 공통 기능을 모아둔 클래스라고 생각하면 된다.
public class Parent {
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
