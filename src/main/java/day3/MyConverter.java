package day3;

import java.util.Stack;

public class MyConverter implements Converter {

    // Stack lưu kết quả - sử dụng stack có  sẵn trong Java
    private Stack<String> history;

    // Khai báo phương thức khởi tạo
    public MyConverter() {
        history = new Stack<>();
    }

    @Override
    public String decToBin(long num) {
        // Tạo stack lưu trữ String
        Stack<String> stack = new Stack<>();
        // Tạo biến
        long t = -1, r = -1;
        while (true) {
            // Thương
            t = num / 2;
            // Số dư
            r = num % 2;
            // Thêm số dư vào ngăn xếp
            stack.push(String.valueOf(r));
            // Kiểm tra xem t == 0??
            if (t == 0) break;
            // Chuẩn bị cho vòng lặp tiếp theo
            num = t;
        }
        // Toàn bộ số dư đã nằm trong Stack
        StringBuffer buffer = new StringBuffer();
        for (int i = stack.size() - 1; i >= 0; i--) {
            buffer.append(stack.get(i));
        }
        return buffer.toString();
    }

    @Override
    public String decToOct(long num) {
        // Tạo stack lưu trữ String
        Stack<String> stack = new Stack<>();
        // Tạo biến
        long t = -1, r = -1;
        while (true) {
            // Thương
            t = num / 8;
            // Số dư
            r = num % 8;
            // Thêm số dư vào ngăn xếp
            stack.push(String.valueOf(r));
            // Kiểm tra xem t == 0??
            if (t == 0) break;
            // Chuẩn bị cho vòng lặp tiếp theo
            num = t;
        }
        // Toàn bộ số dư đã nằm trong Stack
        StringBuffer buffer = new StringBuffer();
        for (int i = stack.size() - 1; i >= 0; i--) {
            buffer.append(stack.get(i));
        }
        return buffer.toString();
    }

    @Override
    public String decToHex(long num) {
        // Tạo stack lưu trữ String
        Stack<String> stack = new Stack<>();
        // Tạo biến
        long t = -1, r = -1;
        while (true) {
            // Thương
            t = num / 16;
            // Số dư
            r = num % 16;
            // Thêm số dư vào ngăn xếp
            // Lưu ý: nếu r == 10 -> push "A"
            if (r == 10) {
                stack.push("A");
            } else if (r == 11) {
                stack.push("B");
            } else if (r == 12) {
                stack.push("C");
            } else if (r == 13) {
                stack.push("D");
            } else if (r == 14) {
                stack.push("E");
            } else if (r == 15) {
                stack.push("F");
            } else {
                stack.push(String.valueOf(r));
            }
            // Kiểm tra xem t == 0??
            if (t == 0) break;
            // Chuẩn bị cho vòng lặp tiếp theo
            num = t;
        }
        // Toàn bộ số dư đã nằm trong Stack
        StringBuffer buffer = new StringBuffer();
        for (int i = stack.size() - 1; i >= 0; i--) {
            buffer.append(stack.get(i));
        }
        return buffer.toString();
    }

    @Override
    public void saveStack(String result) {
        // VD: 10 = 1010(2)
        // VD: 1000 = 3E8(16)
        history.push(result);
    }

    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("Không có lịch sử chuyển đổi");
            return;
        }
        System.out.println("History");
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
    }
}
