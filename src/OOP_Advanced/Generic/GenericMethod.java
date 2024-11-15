package OOP_Advanced.Generic;

// 넘어온 배열에 대해 출력해주는 메서드
// 제네릭 메서드 사용하여 출력
// 제네릭 메서드 또한 static으로 사용할 수 있다.
public class GenericMethod {

    public <T> void print(T[] item) {
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i]);
        }
    }

    // 전달되는 제네릭 매개 변수를 제한 할 수 있다.
    // 반환형 앞에 <타입 변수 extends 클래스명>을 넣어주면 해당 클래스와 해당 클래스를 상속받은 타입만 제네릭으로 사용할 수 있다.
    public static <T extends String> void firstStringPrint(T str) {
        if (str.length() > 0) {
            System.out.println(str.charAt(0));
        }
    }
}
