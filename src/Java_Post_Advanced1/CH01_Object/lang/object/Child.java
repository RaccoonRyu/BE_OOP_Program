package Java_Post_Advanced1.CH01_Object.lang.object;

// 명시적으로 특정 클래스를 상속받으면 Object를 상속받지 않는다.
public class Child extends Parent {

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
