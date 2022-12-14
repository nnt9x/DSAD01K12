package day4;

public class SinglyLinkedList implements LinkedListOperator {

    private Node head = null;

    @Override
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    @Override
    public void insertEnd(int data) {
        // Làm thế nào để insert vào cuối ??
        if (head == null) {
            insertFirst(data);
        } else {
            Node item = head;
            while (true) {
                if (item.getNext() == null) {
                    break;
                }
                item = item.getNext();
            }
            Node lastNode = new Node(data);
            item.setNext(lastNode);
        }
    }

    @Override
    public void insertMid(int data, int position) {
        // Kiểm position < size -1
        if (position >= size() - 1) {
            throw new RuntimeException("Vượt quá kích thước linked list");
        }
        // Ngược lại -> hợp lệ?
        // Cần tìm ra Node vị trí pos - 1
        Node tmp = head;
        for (int i = 0; i < position - 1; i++) {
            tmp = tmp.getNext();
        }
        // Tạo node mới
        Node newNode = new Node(data);
        newNode.setNext(tmp.getNext());
        tmp.setNext(newNode);
    }

    @Override
    public void deleteFirst() {
        // Ý tưởng:
        if (size() == 0) {
            throw new RuntimeException("Danh sách rỗng");
        }
        Node tmp = head;
        head = tmp.getNext();
        tmp.setNext(null);

    }

    @Override
    public void deleteEnd() {
        if (size() == 0) {
            throw new RuntimeException("Danh sách rỗng");
        }
        Node tmp = head;
        while (true) {
            if (tmp.getNext().getNext() == null) {
                break;
            }
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
            Node preNode = head, currentNode;
            for (int i = 0; i < position - 1; i++) {
                preNode = preNode.getNext();
            }
            currentNode = preNode.getNext();
            preNode.setNext(currentNode.getNext());
            currentNode.setNext(null);
        }
    }

    @Override
    public void update(int newData, int position) {

    }

    @Override
    public int size() {
        // Làm thế nào để tính kích thước??
        int count = 0;
        if (head != null) {
            Node tmp = head;
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
    public int search(int data) {
        return 0;
    }

    @Override
    public int search(Node node) {
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
