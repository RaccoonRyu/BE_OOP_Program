package Java_Post_Advanced2.CH02_Collection.set;

import Java_Post_Advanced2.CH02_Collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        // Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode()); // 객체의 참조값을 가지고 만든 해시코드

        // Java는 각 클래스 마다 hashCode를 이미 오버라이딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";
        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());

        // hashCode는 마이너스 값이 들어올 수 있다.
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode()); // -1 출력

        // 동등 비교 -> 인스턴스는 다르지만, equals는 같다. (물리적으로는 다르지만 논리적으로는 같다.)
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        // equals + hashCode를 오버라이딩 하지 않은 경우
        System.out.println("(member1 == member2) = " + (member1 == member2)); // false
        System.out.println("(member1.equals(member2)) = " + (member1.equals(member2))); // id 값이 동일하기 때문에 true
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode()); // id값이 동일하기 때문에 해시코드도 동일
    }
}
