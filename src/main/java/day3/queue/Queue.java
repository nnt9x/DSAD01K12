package day3.queue;

public class Queue {
    private int items[];
    private int size;

    // Vị trị đầu hàng và cuối hàng
    private int front, rear;

    // Phương thức khởi tạo
    public Queue(int size) {
        // Khơi tạo giá trị đầu hàng và cuối hàng
        front = -1;
        rear = -1;
        // Khởi tạo mảng chứa các giá trị
        this.size = size;
        items = new int[size];
    }

    public boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    public int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */ else {
                front++;
            }
            System.out.println("Deleted -> " + element);
            return (element);
        }
    }

    public void display() {
        /* Function to display elements of Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + "  ");

            System.out.println("\nRear index-> " + rear);
        }
    }

}
