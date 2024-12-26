package Java_Post_Advanced1.CH08_ExceptionHandling.basic.unchecked;

public class UncheckedThrowMain {
    public static void main(String[] args) { // 체크 예외와 달리 throws 예외를 선언하지 않아도 예외가 발생하면 main 밖으로 던진다.
        // 컴파일러가 이런 부분을 체크하지 않기 때문에 '언체크' 예외이다.
        // 물론 throws 예외를 선언도 가능하다. 생략이 가능할 뿐!

        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료"); // 예외가 main 밖으로 던져져서 해당 로직 수행되지 않음
    }
}
