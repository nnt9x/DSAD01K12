package day1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // Khai báo chiều dài, chiều rộng
        double chieuDai, chieuRong, chuVi;

        // Nhập chiều dài, chiều rộng
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập chiều dài: ");
                chieuDai = Double.parseDouble(scanner.nextLine());
                System.out.print("Chiều rộng: ");
                chieuRong = Double.parseDouble(scanner.nextLine());
                if (chieuDai > 0 && chieuRong > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Sai định dạng dữ liệu");
            }
        }
        scanner.close();

        // Viết khác
        chuVi = (chieuDai + chieuRong) * 2;
        System.out.printf("Chu vi là %.2f \n", chuVi);
        System.out.println("Kết thúc chương trình");
    }
}
