package OOP_Inter.Poly.Fruit;

public class 과일테스트 {

    public static void 과일확인(과일 과일) {
        if (과일 instanceof 바나나) {
            System.out.println("바나나 입니다.");
        } else if (과일 instanceof 배) {
            System.out.println("배 입니다.");
        } else if (과일 instanceof 사과) {
            System.out.println("사과 입니다.");
        } else {
            System.out.println("바나나, 배, 사과가 아닙니다.");
        }
    }

    public static void main(String[] args) {
        과일 과일1 = new 과일();
        과일 과일2 = new 바나나(); // 업 캐스팅
        과일 과일3 = new 배(); // 업 캐스팅
        과일 과일4 = new 사과(); // 업 캐스팅

        과일확인(과일1); // 과일 타입이므로 아닙니다 출력
        과일확인(과일2); // 근본은 바나나이므로 바나나 입니다 출력
        과일확인(과일3); // 근본은 배이므로 배 입니다 출력
        과일확인(과일4); // 근본은 사과이므로 사과 입니다 출력

        생선 생선1 = new 생선();
        /*if (생선1 instanceof 과일) { // 상속관계가 아니면 컴파일 에러 발생
            System.out.println("바나나 입니다.");
        } else {
            System.out.println("바나나, 배, 사과가 아닙니다.");
        }*/
    }
}
