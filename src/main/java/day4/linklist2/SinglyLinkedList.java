package day4.linklist2;

public class SinglyLinkedList<T> implements LinkedListOperator<T> {

    private Node<T> head = null;

    @Override
    public void insertFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNext(head);
        head = newNode;
    }

    @Override
    public void insertEnd(T data) {
        // Làm thế nào để insert vào cuối ??
        if (head == null) {
            insertFirst(data);
        } else {
            Node<T> item = head;
            while (item.getNext() != null) {
                item = item.getNext();
            }
            Node<T> lastNode = new Node<T>(data);
            item.setNext(lastNode);
        }
    }

    @Override
    public void insertMid(T data, int position) {
        // Kiểm position < size -1
        if (position >= size() - 1) {
            throw new RuntimeException("Vượt quá kích thước linked list");
        }
        // Ngược lại -> hợp lệ?
        // Cần tìm ra Node vị trí pos - 1
        Node<T> tmp = head;
        for (int i = 0; i < position - 1; i++) {
            tmp = tmp.getNext();
        }
        // Tạo node mới
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(tmp.getNext());
        tmp.setNext(newNode);
    }

    @Override
    public void deleteFirst() {
        // Ý tưởng:
        if (size() == 0) {
            throw new RuntimeException("Danh sách rỗng");
        }
        Node<T> tmp = head;
        head = tmp.getNext();
        tmp.setNext(null);

    }

    @Override
    public void deleteEnd() {
        if (size() == 0) {
            throw new RuntimeException("Danh sách rỗng");
        }
        Node<T> tmp = head;
        while (tmp.getNext().getNext() != null) {
            tmp = tmp.getNext();
        }
        // tmp là gân cuối
        tmp.setNext(null);
    }

    @Override
    public void deleteMid(int position) {
        if (position > size() - 1) {
            throw new RuntimeException("Vượt quá kích thước linked list");
        }
        if (position == 0) {
            deleteFirst();
        } else if (position == size() - 1) {
            deleteEnd();
        } else {
            // Tìm Node ở position và position -1
            Node<T> preNode = head, currentNode;
            for (int i = 0; i < position - 1; i++) {
                preNode = preNode.getNext();
            }
            currentNode = preNode.getNext();
            preNode.setNext(currentNode.getNext());
            currentNode.setNext(null);
        }
    }

    @Override
    public void update(T newData, int position) {

    }

    @Override
    public int size() {
        // Làm thế nào để tính kích thước??
        int count = 0;
        if (head != null) {
            Node<T> tmp = head;
            while (true) {
                if (tmp != null) {
                    count++;
                } else {
                    break;
                }
                tmp = tmp.getNext();
            }
        }
        return count;
    }

    @Override
    public int search(T data) {
        return 0;
    }

    @Override
    public int search(Node<T> node) {
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public void printLinkedList() {
        // In ra giá trị
        Node item = head;
        if (head == null) {
            System.out.println("Danh sách rỗng");
        } else {
            System.out.print("Linked list: ");
            while (true) {
                System.out.print("\t" + item.getData());
                item = item.getNext();
                if (item == null) break;
            }
            System.out.println();
        }
    }
}
