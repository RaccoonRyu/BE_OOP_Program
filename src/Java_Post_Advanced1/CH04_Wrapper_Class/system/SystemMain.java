package Java_Post_Advanced1.CH04_Wrapper_Class.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초) 가져오기
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);
        
        // 현재 시간(나노초) 가져오기
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 운영체제(Windows)에서 설정한 환경 변수 읽기
        System.out.println("getenv = " + System.getenv());

        // Java가 사용하는 시스템 속성(설정) 읽기 (ex. Java 버전, Java가 사용하는 기본 인코딩 ...)
        System.out.println("properties : " + System.getProperties());
        System.out.println("Java version : " + System.getProperty("java.version"));

        // 시스템 레벨에서 배열을 (for-loop 대비) 고속으로 복사
        char[] originChars = {'h', 'e', 'l', 'l', 'o'};
        char[] copyChars = new char[5];
        System.arraycopy(originChars, 0, copyChars, 0, originChars.length);
        System.out.println("originChars = " + originChars);
        System.out.println("originChars.toString = " + Arrays.toString(originChars));
        System.out.println("copyChars = " + copyChars);
        System.out.println("copyChars.toString = " + Arrays.toString(copyChars));

        // 프로그램 종료 (Java 종료) - 가급적이면 사용을 권장하지 않음
        System.exit(0);
        System.out.println("hello");
    }
}
