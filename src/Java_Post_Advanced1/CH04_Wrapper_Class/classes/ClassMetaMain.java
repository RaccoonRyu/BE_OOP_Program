package Java_Post_Advanced1.CH04_Wrapper_Class.classes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws ClassNotFoundException {
        // Class 클래스 조회
        // 타입.class를 사용하여 Class 타입의 변수를 선언할 수 있다.
        // 이를 사용하여 해당 타입 클래스에 대한 모든 정보를 얻어올 수 있다.
        Class class1 = String.class; // 1. 클래스에서 조회
        //Class class2 = new String().getClass(); // 2. 인스턴스에서 조회(인스턴스가 사용하는 클래스의 정보)
        //Class class3 = Class.forName("java.lang.String"); // 3. 문자열로 조회(패키지명을 포함한 클래스명 전체를 입력)

        // Class가 가진 모든 필드 출력
        // 여기서는 String 클래스에 대한 정보를 조회한다.
        Field[] fields = class1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getType() + " " + field.getName());
        }

        // Class가 가진 모든 메서드 출력
        Method[] methods = class1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        // Class의 상위 클래스 정보 출력
        System.out.println("Super class : " + class1.getSuperclass().getName());
        
        // Class의 인터페이스 정보 출력
        Class[] interfaces = class1.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("anInterface = " + anInterface.getName());
        }
    }
}
