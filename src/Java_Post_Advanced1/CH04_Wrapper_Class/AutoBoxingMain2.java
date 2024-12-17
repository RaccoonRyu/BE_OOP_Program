package Java_Post_Advanced1.CH04_Wrapper_Class;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        // Primitive -> Wrapper (기본형 -> Wrapper) 자동 박싱
        int value = 7;
        Integer boxedValue = value;

        // Wrapper -> Primitive (Wrapper -> 기본형) 자동 언박싱
        int unboxedValue = boxedValue;

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
