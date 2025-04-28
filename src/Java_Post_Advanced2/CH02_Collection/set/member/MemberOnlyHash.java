package Java_Post_Advanced2.CH02_Collection.set.member;

import java.util.Objects;

public class MemberOnlyHash {

    private String id;

    public MemberOnlyHash(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberOnlyHash{" +
                "id='" + id + '\'' +
                '}';
    }

    // hashCode만 오버라이딩
    // id 기준으로 hash코드 생성
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
