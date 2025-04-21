package Java_Post_Advanced2.CH02_Collection.list;

// 바깥에 있던 제네릭이 아닌 Node를 사용하지 않고 내부에 제네릭 타입으로 선언한 중첩 클래스 Node를 사용한다.
// 그리고 MyList 인터페이스를 구현한다.
public class MyLinkedList<E> implements MyList<E>{

    private Node<E> first; // 첫 번째 노드 위치
    private int size = 0; // 자료구조에 입력된 데이터의 사이즈. 데이터 추가될 때 마다 하나씩 증가

    @Override
    public void add(E o) { // 새 노드를 만들어 마지막에 데이터를 추가한다. O(n)
        Node<E> newNode = new Node<>(o);
        if (first == null) { // 첫 노드가 없으면 새 노드는 첫 번째 노드이다.
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode(); // 기존에 노드가 있으면 새 노드는 마지막 노드에 이어준다.
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    // index가 추가된 add
    @Override
    public void add(int idx, E e) {
        Node<E> newNode = new Node<>(e);
        if (idx == 0) { // index가 0인 경우 제일 앞 노드이므로 해당 노드의 앞에 새 노드를 위치한다.
            newNode.next = first;
            first = newNode;
        } else { // index가 중간이나 뒤인 경우 index의 직전 노드를 찾고 해당 노드의 뒤에 새 노드를 위치한다.
            Node<E> prev = getNode(idx - 1); // 직전 노드 찾기
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    // index가 추가된 remove
    @Override
    public E remove(int idx) {
        Node<E> removeNode = getNode(idx);
        E removedItem = removeNode.item;
        if (idx == 0) { // index가 0인 경우 제일 앞 노드 이므로 해당 노드를 삭제 후 바로 다음 노드를 first로 변경한다.
            first = removeNode.next;
        } else { // index가 중간이나 뒤인 경우 index의 직전 노드를 찾고 해당 노드의 뒤에 삭제될 노드의 다음 노드를 연결한다.
            Node<E> prev = getNode(idx - 1);
            prev.next = removeNode.next;
        }
        // 이후 삭제할 노드가 가진 값과 링크를 삭제하고, 사이즈를 줄인다.
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    @Override
    public E set(int index, E element) { // 특정 index에 해당하는 노드의 값을 set하고 나올 때 옛날 값을 반환한다. O(n)
        Node<E> x = getNode(index);
        E oldVal = x.item;
        x.item = element;
        return oldVal;
    }

    @Override
    public E get(int index) { // 특정 index에 해당하는 노드의 값을 가져온다. O(n)
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int idx) {
        Node<E> x = first;
        for (int i = 0; i < idx; i++) {
            x = x.next;
        }
        return x;
    }

    @Override
    public int indexOf(E o) { // 파라미터로 들어온 object에 해당하는 값이 있는 노드의 index를 반환한다. 없으면 -1 반환. O(n)
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) { // 처음 노드부터 x가 null이 아닐 때 까지 다음 노드를 계속 순회
            if(o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
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

    private static class Node<E> { // 해당 클래스 내부에서만 사용하기 위해 정적 중첩 클래스인 제네릭 타입 Node 선언
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        // [A -> B -> C] 처럼 출력
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this; // 가장 첫 번째 노드
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if (x.next != null) {
                    sb.append(" -> ");
                }
                x = x.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
