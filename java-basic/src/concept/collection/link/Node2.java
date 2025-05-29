package concept.collection.link;

public class Node2 {

    Object item;
    Node2 next;
    public Node2(Object item) {
        this.item = item;
    }
    //IDE 생성 toString() @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                '}';
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node2 x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next; }
        sb.append("]");
        return sb.toString();
    }
}
