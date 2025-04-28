package Java_Post_Advanced2.CH02_Collection.set.member;

import Java_Post_Advanced2.CH02_Collection.set.MyHashSetV2;

// equals와 hashCode를 모두 재정의한 예제
public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A"); // 아이디가 같음 -> 같은 회원 아닐까?

        System.out.println("m1.hashCode() = " + m1.hashCode()); // 6번 해시 인덱스
        System.out.println("m2.hashCode() = " + m2.hashCode()); // 6번 해시 인덱스. 재정의한 hashCode를 사용하기 때문에 동일한 해시 인덱스를 갖는다.
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); // id가 동일하기 때문에, id를 기준으로 재정의한 equals를 사용하여 m1과 m2가 동일함을 확인 가능하다.

        set.add(m1);
        set.add(m2);
        System.out.println(set); // 중복 등록을 방지하여 set 자료구조의 의의를 보장함!

        // 검색 성공
        Member searchMember = new Member("A");
        System.out.println("searchMember.hashCode() = " + searchMember.hashCode()); // 6번 해시 인덱스. 재정의한 hashCode를 사용하기 때문에 동일한 해시 인덱스를 갖는다.
        boolean result = set.contains(searchMember);
        System.out.println("result = " + result); // hashCode와 equals를 모두 id 기준으로 재정의 하여 검색에 성공함을 확인 가능하다.
    }
}
