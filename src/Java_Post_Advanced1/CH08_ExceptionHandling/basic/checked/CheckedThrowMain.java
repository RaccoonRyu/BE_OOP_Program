package Java_Post_Advanced1.CH08_ExceptionHandling.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException { // main 내에서도 예외를 처리하는 별도 로직이 없기 때문에 main 밖으로 던짐
        Service service = new Service();
        service.catchThrow(); // 예외를 main()으로 던짐
        System.out.println("정상 종료"); // 예외가 main 밖으로 던져져서 해당 로직 수행되지 않음
    }
}
