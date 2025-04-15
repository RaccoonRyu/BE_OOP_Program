package Java_Post_Advanced2.CH02_Collection.link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        System.out.println("== 마지막에 데이터 추가 : O(n) ==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("== 첫 번째 항목에 데이터 추가, 삭제 : O(1) ==");
        list.add(0, "d");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        System.out.println("== 중간에 데이터 추가, 삭제 : O(n) == ");
        list.add(1, "e");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
