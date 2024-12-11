package Java_Post_Advanced1.CH01_Object.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스의 메서드
        // 객체에 대한 정보(클래스명, 인스턴스 정보)를 제공해준다.
        String string = child.toString();
        System.out.println(string);
    }
}
