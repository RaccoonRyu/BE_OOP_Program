package Java_Post_Advanced1.CH01_Object.lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        // toString() 반환값 출력
        System.out.println(string); // 클래스에 대한 정보(패키지명, 클래스명)@인스턴스의 참조값(해시코드) 순으로 출력

        // object 직접 출력 (sout)
        // println() 메서드는 사실 내부에서 toString()을 호출한다.
        // Object 타입(자식 포함)이 println()에 인수로 전달되면 내부에서 obj.toString() 메서드를 호출하여 결과를 출력한다.
        // 따라서 println()에 객체를 바로 전달하면 toString()을 직접 호출할 필요 없이 바로 객체의 정보를 출력할 수 있다.
        System.out.println(object);
    }
}
