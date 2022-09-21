package day2.stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Chuyển số x cơ số 10 sang cơ số 8, dùng 8 bit
        Stack stack = new Stack(8);

        // Nhập x
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập x = ");
        int x = Integer.parseInt(scanner.nextLine());

        // Khai báo x, t, r
        int t = -1, r = -1;
        while (true){
            // VD: 5/2 =2
            t = x / 8;
            r = x % 8;
            // Thêm số dư r vào ngăn xếp
            stack.push(r);
            if(t == 0) break;
            // Chuẩn bị dữ liệu cho vòng lặp mới
            x = t;
        }
        // In ra phần chuyển cơ số
        System.out.print("x = ");
        stack.printStackTopToEnd();

    }
}
