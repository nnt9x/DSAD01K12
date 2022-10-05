package day6;

public class Main {
    public static void main(String[] args) {
        /*
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node1.setNodeLeft(node2);
        node1.setNodeRight(node3);

        node2.setNodeLeft(node4);
        node2.setNodeRight(node5);

        node5.setNodeLeft(node6);
        node5.setNodeRight(node7);

        BinaryTree binaryTree = new BinaryTree(node1);
         */

        Node node1 = new Node(1);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node9 = new Node(9);
        Node node12 = new Node(12);

        node1.setNodeRight(node9);
        node1.setNodeLeft(node12);
        node12.setNodeLeft(node5);
        node12.setNodeRight(node6);

        BinaryTree tree = new BinaryTree(node1);

        // Duyet theo inoder
        tree.inorder(node1);
        System.out.println();
        tree.preorder(node1);
        System.out.println();
        tree.postorder(node1);

    }
}
