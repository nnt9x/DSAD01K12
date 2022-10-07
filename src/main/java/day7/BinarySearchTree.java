package day7;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Ham insert
    // Y tuong:
    // Input: value -> tao Node(value) -> them vao cay
    // TH1: cay rong, phan tu dau them vao -> node goc
    // TH2: cay ko rong:
    // Neu value > root.value -> root.right = Node(value)
    // Neu value < root.value -> root.left = Node(value)
    public void insert(long value){
        if(root == null){
            root = new Node(value);
            return;
        }
        Node tmp = root;
        while (true){
            if(value > tmp.getValue()){
                if(tmp.getRight() == null){
                    tmp.setRight(new Node(value));
                }
                else {
                    tmp = tmp.getRight();
                }
            } else if (value < tmp.getValue()) {
                if(tmp.getLeft() == null){
                    tmp.setLeft(new Node(value));
                }
                tmp = tmp.getLeft();
            }
            else {
                break;
            }
        }
    }

    public Node contain(long value){
        // Them code
        return null;
    }

}
