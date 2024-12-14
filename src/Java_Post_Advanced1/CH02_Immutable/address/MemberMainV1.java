package Java_Post_Advanced1.CH02_Immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);

        // 회원A, B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberA = " + memberB);

        // 회원B의 주소를 부산으로 변경해야함
        memberB.getAddress().setVal("부산");
        System.out.println("memberA = " + memberA);
        System.out.println("memberA = " + memberB); // 회원 A, B 둘 다 주소가 부산으로 바뀐다 ....
    }
}
