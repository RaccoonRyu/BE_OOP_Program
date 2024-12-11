package Java_Post_Advanced1.CH01_Object.lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    /*// UserV2의 동등성을 id로 비교하기 위해 equals 오버라이딩 (간편 버전)
    @Override
    public boolean equals(Object obj) {
        // 매개변수인 Object 타입에는 객체의 특정 값(id)이 없기 때문에 다운 캐스팅
        UserV2 user = (UserV2) obj;
        return this.id.equals(user.id);
    }*/

    // UserV2의 동등성을 id로 비교하기 위해 equals 오버라이딩 (정석 버전)
    // IDE에서 동등성을 비교할 필드를 선택하여(여기서는 id) 자동 생성 가능
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

}
