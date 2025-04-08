package Java_Post_Advanced2.CH02_Collection.array;

public class MyArrayListV2Main {
    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2(2);
        System.out.println("== 데이터 추가 ==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);

        // 범위를 초과해도 배열이 늘어나기 때문에 예외가 발생하지 않는다.
        list.add("f");
        System.out.println(list);
    }
}
