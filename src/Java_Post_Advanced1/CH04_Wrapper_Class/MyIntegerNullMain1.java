package Java_Post_Advanced1.CH04_Wrapper_Class;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println("findValue = " + findValue(intArr, -1));
        System.out.println("findValue = " + findValue(intArr, 0));
        System.out.println("findValue = " + findValue(intArr, 1));
        System.out.println("findValue = " + findValue(intArr, 100));
    }
    
    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if(myInteger.getVal() == target) {
                return myInteger;
            }
        }

        return null;
    }
}
