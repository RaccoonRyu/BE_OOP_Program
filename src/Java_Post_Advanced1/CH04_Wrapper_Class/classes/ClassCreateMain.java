package Java_Post_Advanced1.CH04_Wrapper_Class.classes;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass1 = Hello.class;
        //Class helloClass2 = Class.forName("Java_Post_Advanced1.CH04_Wrapper_Class.classes.Hello");

        // Class 클래스를 통한 객체 생성
        Hello hello = (Hello) helloClass1.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("hello = " + hello);
        System.out.println("result = " + result);
    }
}
