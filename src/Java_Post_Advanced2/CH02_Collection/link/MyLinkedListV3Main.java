package Java_Post_Advanced2.CH02_Collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> strList = new MyLinkedListV3<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        String str = strList.get(0);
        System.out.println("str = " + str);

        MyLinkedListV3<Integer> intList = new MyLinkedListV3<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);
    }
}
