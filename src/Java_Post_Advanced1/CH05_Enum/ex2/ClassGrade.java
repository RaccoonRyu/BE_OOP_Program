package Java_Post_Advanced1.CH05_Enum.ex2;

// 타입 안전 열거형 패턴
// 회원 등급을 다루는 클래스를 생성하고, 등급별로 상수 선언
// 상수마다 별도 인스턴스 생성 후 생성한 인스턴스를 상수에 대입
// 상수로 선언하기 위해 static, final 키워드 사용
// 이를 통해 정해진 객체만 사용할 수 있기 때문에, 잘못된 값을 입력하는 문제를 근본적으로 방지할 수 있고(타입 안정성 향상),
// 정해진 객체만 사용하므로 데이터의 일관성이 보장된다. (데이터 일관성)
public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(); //x001
    public static final ClassGrade GOLD = new ClassGrade(); //x002
    public static final ClassGrade DIAMOND = new ClassGrade(); //x003

    //private 생성자 추가하여 외부에서의 생성 방지
    private ClassGrade() {}
}
