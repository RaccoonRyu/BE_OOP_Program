package OOP_Advanced;

public class Class_StringBuffer {
    public static void main(String[] args) {

        // StringBuffer
        /*StringBuffer sb = new StringBuffer(); // java.lang에 있어 import없이 사용
        sb.append("홍길동"); // append(파라미터) : StringBuffer에 파라미터로 입력한 내용 추가. 메서드 체인이 가능
        sb.append(System.lineSeparator()); // System.lineSeparator() : StringBuffer에서 줄바꿈을 필요로할때 사용
        sb.append("학생");
        sb.append(System.lineSeparator());
        sb.append(20);
        System.out.println(sb.toString()); // StringBuffer를 String으로*/

        // StringBuilder
        StringBuilder sb2 = new StringBuilder();
        sb2.append("홍길동"); // append(파라미터) : StringBuffer에 파라미터로 입력한 내용 추가. 메서드 체인이 가능
        sb2.append(System.lineSeparator()); // System.lineSeparator() : StringBuffer에서 줄바꿈을 필요로할때 사용
        sb2.append("학생")
                .append(System.lineSeparator())
                .append(20);
        System.out.println(sb2.toString());

        // StringBuffer vs StringBuilder?
        // 스트링 버퍼는 메서드가 synchronized 키워드를 사용하여 일종의 락을 걸어주므로 멀티-스레드 환경에서 사용하기 좋다.
        // 그 외에는 스트링 빌더를 사용해도 된다. (사실 그 둘의 큰 차이는 없다.)

        // 변수를 포함한 StringBuilder -> format을 사용하면 편함
        String name = "홍길동";
        String dept = "학생";
        int age = 20;

        StringBuilder sb3 = new StringBuilder();
        sb3.append(String.format("이름 : %s", name));
        sb3.append(System.lineSeparator());
        sb3.append(String.format("소속 : %s", dept))
                .append(System.lineSeparator())
                .append(String.format("나이 : %d", age));
        System.out.println(sb3.toString());

        // StringBuilder를 기반으로 개행과 포맷기능을 하는 함수를 포함한 Class(StringPlus)를 만들고싶다!
        Class_StringPlus sp = new Class_StringPlus();
        //sp.append(String.format("이름 : %s", name));
        sp.appendFormat("이름 : %s", name)
                .line()
                .appendFormat("소속 : %s", dept)
                .line()
                .appendFormat("나이 : %d", age);
        System.out.println(sp); // StringPlus에서 toString을 오버라이딩 하지 않으면 Object의 toString 출력
    }
}
