package Java_Post_Advanced1.CH04_Wrapper_Class;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        // Primitive -> Wrapper (기본형 -> Wrapper) 직접 박싱
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        // Wrapper -> Primitive (Wrapper -> 기본형) 직접 언박싱
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
