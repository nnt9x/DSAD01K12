package day6;

public class BinaryTree {
    private Node rootNode = null;

    public BinaryTree(Node rootNode) {
        this.rootNode = rootNode;
    }

    public Node getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }

    public void inorder(Node node) {
        if (node == null)
            return;
        // Traverse left
        inorder(node.getNodeLeft());
        // Traverse root
        System.out.print(node.getValue() + "->");
        // Traverse right
        inorder(node.getNodeRight());
    }

    public void preorder(Node node) {
        if (node == null)
            return;

        // Traverse root
        System.out.print(node.getValue() + "->");
        // Traverse left
        preorder(node.getNodeLeft());
        // Traverse right
        preorder(node.getNodeRight());
    }

    public void postorder(Node node) {
        if (node == null)
            return;

        // Traverse left
        postorder(node.getNodeLeft());
        // Traverse right
        postorder(node.getNodeRight());
        // Traverse root
        System.out.print(node.getValue() + "->");
    }

}
