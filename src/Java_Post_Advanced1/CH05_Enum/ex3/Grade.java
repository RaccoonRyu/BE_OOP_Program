package Java_Post_Advanced1.CH05_Enum.ex3;

// 열거형 enum
// class 대신에 enum 키워드를 사용한다.
// enum은 명명된 상수들의 집합을 정의한다.
public enum Grade { // enum은 자동으로 java.lang.Enum을 상속받는다
    BASIC, GOLD, DIAMOND

    // enum 또한 클래스이며, 외부에서 임의로 생성할 수 없다.
}
