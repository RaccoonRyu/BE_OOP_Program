package OOP_Advanced;

// Math 클래스를 사용하여 소수 n째자리까지 (예제에서는 2) 표현하는 클래스를 만들자!
public class Class_SmartMath {
    public static double round(double d, int n) {
        // 반올림 표현을 위해 d에 10의 n승(Math.pow())을 곱하고, 이를 10의 n승으로 다시 나눈다.
        // 자리수를 올려준 수를 반올림 한 다음 다시 자리수를 내려준다.
        return ((double) Math.round(d * Math.pow(10, n))) / Math.pow(10, n);
    }

    public static double ceil(double d, int n) {
        return ((double) Math.ceil(d * Math.pow(10, n))) / Math.pow(10, n);
    }

    public static double floor(double d, int n) {
        return ((double) Math.floor(d * Math.pow(10, n))) / Math.pow(10, n);
    }

    // 위치 기반 서비스 -> 평면에서 두 점 사이의 거리 공식을 사용하여 진행할 수 있음.
    public static double distance(double x1, double y1, double x2, double y2) {
        // Math.sqrt : 루트(제곱근)를 구하는 함수
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
