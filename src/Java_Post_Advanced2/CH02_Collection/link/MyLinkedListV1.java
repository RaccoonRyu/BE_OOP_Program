package Java_Post_Advanced2.CH02_Collection.link;

public class MyLinkedListV1 {

    private Node first; // 첫 번째 노드 위치
    private int size = 0; // 자료구조에 입력된 데이터의 사이즈. 데이터 추가될 때 마다 하나씩 증가

    public void add(Object o) { // 새 노드를 만들어 마지막에 데이터를 추가한다. O(n)
        Node newNode = new Node(o);
        if (first == null) { // 첫 노드가 없으면 새 노드는 첫 번째 노드이다.
            first = newNode;
        } else {
            Node lastNode = getLastNode(); // 기존에 노드가 있으면 새 노드는 마지막 노드에 이어준다.
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public Object set(int index, Object element) { // 특정 index에 해당하는 노드의 값을 set하고 나올 때 옛날 값을 반환한다. O(n)
        Node x = getNode(index);
        Object oldVal = x.item;
        x.item = element;
        return oldVal;
    }

    public Object get(int index) { // 특정 index에 해당하는 노드의 값을 가져온다. O(n)
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int idx) {
        Node x = first;
        for (int i = 0; i < idx; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object o) { // 파라미터로 들어온 object에 해당하는 값이 있는 노드의 index를 반환한다. 없으면 -1 반환. O(n)
        int index = 0;
        for (Node x = first; x != null; x = x.next) { // 처음 노드부터 x가 null이 아닐 때 까지 다음 노드를 계속 순회
            if(o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
