package OOP_Advanced;

// 기존의 StringBuilder에 개행, 포맷 기능을 추가함
// 하지만 final인 StringBuilder는 상속받을 수 없다..그럼 어떻게?
public class Class_StringPlus {
    StringBuilder sb = null;

    Class_StringPlus() {
        sb = new StringBuilder(32);
    }

    // 문자열 추가 함수
    public void append(String str) {
        sb.append(str);
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    // 포맷처리, 개행, 내용을 더하며 개행하는 함수 작성
    // 메서드 체인을 위해 Return 타입은 현재 클래스타입의 객체
    public Class_StringPlus appendFormat(String format, Object... args) {
        sb.append(String.format(format, args));
        return this;
    }

    public Class_StringPlus line() {
        sb.append(System.lineSeparator());
        return this;
    }

    public Class_StringPlus appendLine(String str) {
        this.append(str);
        this.line();
        return this;
    }
}
