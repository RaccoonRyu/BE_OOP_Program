package OOP_Advanced;

public class Class_Math {
    public static void main(String[] args) {
        double d1 = 12.426;

        System.out.println(d1);
        System.out.println(Math.round(d1)); // 반올림. 12
        System.out.println(Math.ceil(d1)); // 올림. 13
        System.out.println(Math.floor(d1)); // 버림. 12

        // 실무 : 소수 n째자리까지 표현하기 위해 반올림/올림/버림
        // 아까 StringPlus처럼 Math 클래스를 개선하여 실무에서 사용하기 좋은 클래스를 만들자!
        System.out.println("===================================");
        System.out.println(Class_SmartMath.round(d1, 2)); // 반올림. 12.43
        System.out.println(Class_SmartMath.ceil(d1, 2)); // 올림. 12.43
        System.out.println(Class_SmartMath.floor(d1, 2)); // 버림. 12.42

        double x1 = 1;
        double y1 = 1;
        double x2 = 2;
        double y2 = 2;

        System.out.println("두 점 사이의 거리 : " + Class_SmartMath.distance(x1, y1, x2, y2));

    }
}
