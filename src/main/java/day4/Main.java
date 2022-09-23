package day4;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(5);
        singlyLinkedList.insertFirst(6);
        singlyLinkedList.insertEnd(7);
        singlyLinkedList.printLinkedList();
        singlyLinkedList.insertMid(8, 1);
        singlyLinkedList.printLinkedList();


        int size = singlyLinkedList.size();
        System.out.println("Kích thước " + size);
    }
}
