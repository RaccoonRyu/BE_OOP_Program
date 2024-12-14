package Java_Post_Advanced1.CH02_Immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        // 회원A, B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberA = " + memberB);

        // 회원B의 주소를 부산으로 변경해야함
        //memberB.getAddress().setVal("부산"); // 주소가(멤버 X!!) 불변객체이기 때문에 주소 값 setter 사용 불가. 컴파일 에러
        memberB.setAddress(new ImmutableAddress("부산")); // 새 주소 객체를 생성하고 주소 setter로 전달하여 변경
        System.out.println("memberA = " + memberA); // 회원 A는 서울
        System.out.println("memberA = " + memberB); // B는 주소가 부산으로 잘 바뀐다
    }
}
