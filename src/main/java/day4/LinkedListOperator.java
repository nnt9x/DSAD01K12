package day4;

public interface LinkedListOperator {
    public void insertFirst(int data);

    public void insertEnd(int data);

    public void insertMid(int data, int position);

    public void deleteFirst();

    public void deleteEnd();

    public void deleteMid(int position);

    public void update(int newData, int position);

    public int size();

    public int search(int data);

    public int search(Node node);

    public void sort();

    public void printLinkedList();
}
