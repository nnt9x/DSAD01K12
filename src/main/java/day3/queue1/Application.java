package day3.queue1;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Application {
    public static long getRandomNumber(long min, long max) {
        return (long) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        // Tạo hàng đợi
        Queue<Message> queue = new ArrayDeque<>();

        // Tạo 2 luồng
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // Tạo 10 bản tin từ luồng 1. Trong khoảng 1-3s
                for (int i = 0; i < 10; i++) {
                    // Tạo thời gian ngẫu nhiên
                    long randomTime = getRandomNumber(1, 3);
                    try {
                        Thread.sleep(randomTime);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    long randomID = getRandomNumber(1, 1000);
                    Message msg = new Message(randomID, "From thread 1");
                    queue.add(msg);
                }
            }
        });
        t1.start();

        // Tạo luồng 2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // Tạo 15 bản tin từ luồng 2. Trong khoảng 1-5s
                for (int i = 0; i < 15; i++) {
                    // Tạo thời gian ngẫu nhiên
                    long randomTime = getRandomNumber(1, 5);
                    try {
                        Thread.sleep(randomTime);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    long randomID = getRandomNumber(2000, 5000);
                    Message msg = new Message(randomID, "From thread 2");
                    queue.add(msg);
                }
            }
        });
        t2.start();

        // Kiểm tra cứ 1s xem có dữ liệu trong hàng đợi hay ko-> có sẽ in ra
        while (true){
            // Nếu hàng đợi ko rỗng
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(!queue.isEmpty()){
                Message item = queue.poll();
                System.out.println(item);
            }
        }
    }
}
