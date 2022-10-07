package day6;

public class Main {
    public static void main(String[] args) {

        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node5 = new Node<>(5);
        Node<Integer> node6 = new Node<>(6);
        Node<Integer> node9 = new Node<>(9);
        Node<Integer> node12 = new Node<>(12);

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


        // Cay tree2
        Node<String> nodeA = new Node<>("A");
        Node<String> nodeB = new Node<>("B");
        Node<String> nodeC = new Node<>("C");
        Node<String> nodeD = new Node<>("D");
        Node<String> nodeE = new Node<>("E");
        Node<String> nodeF = new Node<>("F");
        Node<String> nodeG = new Node<>("G");
        Node<String> nodeH = new Node<>("H");
        Node<String> nodeI = new Node<>("I");

        nodeF.setNodeRight(nodeG);
        nodeG.setNodeRight(nodeI);
        nodeI.setNodeLeft(nodeH);

        nodeF.setNodeLeft(nodeB);
        nodeB.setNodeLeft(nodeA);
        nodeB.setNodeRight(nodeD);
        nodeD.setNodeLeft(nodeC);
        nodeD.setNodeRight(nodeE);


        BinaryTree binaryTree2 = new BinaryTree(nodeF);

        System.out.println();
        System.out.print("InOrder: ");
        binaryTree2.inorder(nodeF);
        System.out.println();

        System.out.print("PreOrder: ");
        binaryTree2.preorder(nodeF);
        System.out.println();

        System.out.print("PostOrder: ");
        binaryTree2.postorder(nodeF);
        System.out.println();




    }
}
