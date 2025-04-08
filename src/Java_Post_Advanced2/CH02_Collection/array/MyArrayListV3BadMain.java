package Java_Post_Advanced2.CH02_Collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numList = new MyArrayListV3();

        // 숫자만 입력하기를 기대
        numList.add(1);
        numList.add(2);
        numList.add("문자3"); // 실수로 문자 입력
        System.out.println(numList);

        // Object를 반환하므로 다운 캐스팅 필요
        Object num1 = (Integer) numList.get(0);
        Object num2 = (Integer) numList.get(1);
        //Object num3 = (Integer) numList.get(2); // 문자3을 숫자로 캐스팅하여 예외(ClassCastException) 발생. class java.lang.String cannot be cast to class java.lang.Integer
    }
}
