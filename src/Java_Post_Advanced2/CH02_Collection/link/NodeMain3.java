package Java_Post_Advanced2.CH02_Collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기 : A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("모든 노드 탐색하기");
        printAll(first);

        System.out.println("마지막 노드 조회하기");
        Node last = getLastNode(first);
        System.out.println("last = " + last);

        System.out.println("특정 index의 노드 조회하기");
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node);

        System.out.println("마지막에 데이터 추가(연결)");
        add(first, "D");
        System.out.println(first);
        add(first, "E");
        System.out.println(first);
        add(first, "F");
        System.out.println(first);
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) { // x의 next가 null일 경우 마지막 노드
            x = x.next;
        }
        return x;
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) { // index만큼 loop 수행하여 x.next 호출하면 index번째의 Node가 조회된다.
            x = x.next;
        }
        return x;
    }

    private static void add(Node node, String str) {
        // 마지막 노드 찾기
        Node lastNode = getLastNode(node);
        // 위에서 찾은 마지막 노드가 가리키는 next에 새 노드를 연결
        lastNode.next = new Node(str);
    }
}
