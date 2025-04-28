package Java_Post_Advanced2.CH02_Collection.set.member;

import Java_Post_Advanced2.CH02_Collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A"); // 아이디가 같음 -> 같은 회원 아닐까?

        System.out.println("m1.hashCode() = " + m1.hashCode()); // 5번 해시 인덱스
        System.out.println("m2.hashCode() = " + m2.hashCode()); // 2번 해시 인덱스 오브젝트가 제공하는 단순 참조값이 출력
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); // 참조값이 다르기 때문에 equals의 결과는 false

        set.add(m1);
        set.add(m2);
        System.out.println(set); // set 자료구조임에도 데이터가 중복 등록되는 문제가 있음

        // 검색 실패의 문제도 있음
        MemberNoHashNoEq searchMember = new MemberNoHashNoEq("A");
        System.out.println("searchMember.hashCode() = " + searchMember.hashCode()); // 1번 해시 인덱스
        boolean result = set.contains(searchMember);
        System.out.println("result = " + result); // hashCode가 우연히 같더라도 equals에서 비교하여 검색 실패
    }
}
