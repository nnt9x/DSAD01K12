package day7;

public class Node {
    private long value;
    private Node left;
    private Node right;

    public Node(long value) {
        this.value = value;
    }

    public Node(long value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
