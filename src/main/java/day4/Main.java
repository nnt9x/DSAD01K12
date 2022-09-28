package day4;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(5);
        singlyLinkedList.insertFirst(6);
        singlyLinkedList.insertFirst(7);
        singlyLinkedList.insertFirst(8);
        singlyLinkedList.printLinkedList();
        singlyLinkedList.deleteMid(2);
        singlyLinkedList.printLinkedList();
        singlyLinkedList.deleteMid(2);
        singlyLinkedList.printLinkedList();
        int size = singlyLinkedList.size();
        System.out.println("Kích thước " + size);
    }
}
