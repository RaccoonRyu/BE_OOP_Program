package Java_Post_Advanced2.CH02_Collection.set;

import Java_Post_Advanced2.CH02_Collection.set.member.Member;

// 직접 만든 클래스의 객체를 set에 사용하는 예제
public class MyHashSetV2Main2 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member hi = new Member("hi");
        Member jpa = new Member("JPA"); // 대문자임에 주의
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("hi.hashCode() = " + hi.hashCode());
        System.out.println("JPA.hashCode() = " + jpa.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("spring.hashCode() = " + spring.hashCode());

        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);
        System.out.println(set);

        // 검색
        Member searchMember = new Member("JPA");
        boolean result = set.contains(searchMember);
        System.out.println("set.contains(" + searchMember + ") = " + result);
    }
}
