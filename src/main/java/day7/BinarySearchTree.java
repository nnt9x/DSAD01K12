package day7;

public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;

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
    public void insert(T value){
        if(root == null){
            root = new Node<T>(value);
            return;
        }
        Node<T> tmp = root;

        while (true){
            if(value.compareTo(tmp.getValue()) > 0){
                if(tmp.getRight() == null){
                    tmp.setRight(new Node(value));
                }
                else {
                    tmp = tmp.getRight();
                }
            } else if (value.compareTo(tmp.getValue()) < 0) {
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

    public Node<T> contain(T value){
        // Them code
        Node<T> tmp = root;
        while (tmp != null){
            if(value.compareTo(tmp.getValue())==0){
                return tmp;
            }
            else if (value.compareTo(tmp.getValue()) <0){
                tmp = tmp.getLeft();
            }
            else {
                tmp = tmp.getRight();
            }
        }
        return tmp;
    }

}
