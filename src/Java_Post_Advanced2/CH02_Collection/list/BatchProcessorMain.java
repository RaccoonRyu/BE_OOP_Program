package Java_Post_Advanced2.CH02_Collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list2 = new MyLinkedList<>();

        // BatchProcessor의 생성자에 MyList의 구현체를 무엇으로 사용할지 결정하여 넘긴다.
        // 즉, 의존관계로 주입할 구현체를 BatchProcessor 코드를 작성할 때 결정하는 것이 아니라, 실제로 BatchProcessor 인스턴스를 생성하여 사용할 때 결정한다.
        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(100000); // MyArrayList는 약 5초 이상 소요

        BatchProcessor processor2 = new BatchProcessor(list2);
        processor2.logic(100000); // MyLinkedList는 약 0.01초 이상 소요
    }
}
