package day6;

public class Node <T>{
    // value
    private T value;
    // node left
    private Node nodeLeft = null;
    // node right
    private Node nodeRight = null;

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node nodeLeft, Node nodeRight) {
        this.value = value;
        this.nodeLeft = nodeLeft;
        this.nodeRight = nodeRight;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNodeLeft() {
        return nodeLeft;
    }

    public void setNodeLeft(Node nodeLeft) {
        this.nodeLeft = nodeLeft;
    }

    public Node getNodeRight() {
        return nodeRight;
    }

    public void setNodeRight(Node nodeRight) {
        this.nodeRight = nodeRight;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", nodeLeft=" + nodeLeft +
                ", nodeRight=" + nodeRight +
                '}';
    }
}
