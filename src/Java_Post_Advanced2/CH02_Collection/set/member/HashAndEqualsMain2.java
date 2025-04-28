package Java_Post_Advanced2.CH02_Collection.set.member;

import Java_Post_Advanced2.CH02_Collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A"); // 아이디가 같음 -> 같은 회원 아닐까?

        System.out.println("m1.hashCode() = " + m1.hashCode()); // 6번 해시 인덱스
        System.out.println("m2.hashCode() = " + m2.hashCode()); // 6번 해시 인덱스. 재정의한 hashCode를 사용하기 때문에 동일한 해시 인덱스를 갖는다.
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); // 하지만 Object.equals에서 사용하는 인스턴스의 참조값은 여전히 다르기 때문에 equals의 결과는 false

        System.out.println("System.ref(m1) = " + System.identityHashCode(m1));
        System.out.println("System.ref(m2) = " + System.identityHashCode(m2)); // 실제로 각 인스턴스의 참조값이 다름을 확인 가능

        set.add(m1);
        set.add(m2);
        System.out.println(set); // set 자료구조임에도 여전히 데이터가 중복 등록되는 문제가 있음. 게다가 같은 해시 인덱스 위치에 등록됨.

        // 검색 실패의 문제도 있음
        MemberOnlyHash searchMember = new MemberOnlyHash("A");
        System.out.println("searchMember.hashCode() = " + searchMember.hashCode()); // 6번 해시 인덱스. 재정의한 hashCode를 사용하기 때문에 동일한 해시 인덱스를 갖는다.
        boolean result = set.contains(searchMember);
        System.out.println("result = " + result); // hashCode가 같더라도 equals에서 비교하여 검색 실패
    }
}
