package day1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khai báo chiều dài, chiều rộng
        double chieuDai, chieuRong, chuVi;

        // Nhập chiều dài, chiều rộng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");

        chieuDai = scanner.nextDouble();
        System.out.print("Chiều rộng: ");
        chieuRong = scanner.nextDouble();

        // Kiểm tra điều kiện
        /*
        if (chieuDai > 0 && chieuRong > 0) {
            chuVi = (chieuDai + chieuRong) * 2;
            System.out.printf("Chu vi là %.2f \n", chuVi);
        } else {
            System.out.println("Kích thước không hợp lệ");
        }
        System.out.println("Kết thúc chương trình");
        */

        // Viết khác
        if (chieuDai <= 0 || chieuRong <= 0) {
            System.out.println("Kích thuóc cạnh không hợp lệ");
            return;
        }
        chuVi = (chieuDai + chieuRong) * 2;
        System.out.printf("Chu vi là %.2f \n", chuVi);
        System.out.println("Kết thúc chương trình");
    }
}
