package day4.linklist2;

public interface LinkedListOperator<T> {
    public void insertFirst(T t);

    public void insertEnd(T t);

    public void insertMid(T t, int position);

    public void deleteFirst();

    public void deleteEnd();

    public void deleteMid(int position);

    public void update(T t, int position);

    public int size();

    public int search(T t);

    public int search(Node<T> node);

    public void sort();

    public void printLinkedList();
}
