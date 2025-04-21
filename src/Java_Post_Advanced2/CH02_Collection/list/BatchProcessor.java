package Java_Post_Advanced2.CH02_Collection.list;

public class BatchProcessor {

    // BatchProcessor는 구체적이지 않은 추상적인 MyList에 의존하고 있음
    // 의존한다 : 하나의 클래스가 다른 클래스를 가져다가 사용한다는 뜻
    private final MyList<Integer> list;

    // 생성자를 통한 의존관계 주입
    // 어떤 MyList의 구현체를 선택할 지는 실행 시점에 생성자를 통해 전달하여 결정함 (MyArrayList든 MyLinkedList든)
    // BatchProcessor 외부에서 의존관계가 결정되어 BatchProcessor 인스턴스에 들어오게 된다.
    // -> 이것을 마치 의존관계가 외부에서 주입되는 것 같다고 하여 의존관계 주입이라고 한다.
    // 여기서는 생성자를 통해 의존관계를 주입했기 때문에 생성자 의존관계 주입이라고 한다.
    // 이를 통해 BatchProcessor라는 클라이언트 코드의 변경 없이, BatchProcessor가 실제 인스턴스로 생성 및 실행되는 런타임에서 구현체만 변경하여 다른 알고리즘을 사용할 수 있다.
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i); // 앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("size = " + size + ", 계산 시간 = " + (endTime - startTime) + "ms");
    }
}
