package Java_Post_Advanced2.CH01_Generic.ex5;

public class EraserBox<T> {

    public boolean instanceCheck(Object param) {
        //return param instanceof T;
        // 컴파일 오류 : 타입 매개변수가 런타임에 Object로 변경되기 때문에 항상 참이 반환되는 문제가 발생하여 타입 매개변수에 instanceof 허용하지 않음
        return false;
    }

    public void create() {
        //return new T();
        // 컴파일 오류 : new T가 런타임에는 항상 new Object가 되고 이는 개발자가 의도한 대로 작동하지 않는 문제가 발생하여 타입 매개변수에 new 허용하지 않음
        return;
    }
}
