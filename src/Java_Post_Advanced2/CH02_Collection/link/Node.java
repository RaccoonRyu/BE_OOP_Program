package Java_Post_Advanced2.CH02_Collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    /*@Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }*/

    // [A -> B -> C] 처럼 출력
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this; // 가장 첫 번째 노드
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
