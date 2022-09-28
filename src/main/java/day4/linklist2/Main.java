package day4.linklist2;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Student> linkedList = new SinglyLinkedList<>();
        linkedList.insertFirst(new Student(1,"Student 1", 20));
        linkedList.insertFirst(new Student(2,"Student 2", 21));
        linkedList.insertFirst(new Student(3,"Student 3", 22));
        linkedList.printLinkedList();

        SinglyLinkedList<Double> linkedListDouble = new SinglyLinkedList<>();
        linkedListDouble.insertFirst(1.4);
        linkedListDouble.insertEnd(1.5);
        linkedListDouble.insertMid(1.8,0);
        linkedListDouble.printLinkedList();
    }
}
