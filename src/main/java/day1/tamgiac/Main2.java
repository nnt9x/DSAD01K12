package day1.tamgiac;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // Bước 1: Nhập d, h, a
        Scanner in = new Scanner(System.in);
        double d, h, a, cv, dt;
        System.out.print("Nhập cạnh đáy: ");
        d = Double.parseDouble(in.nextLine());
        System.out.print("Nhập chiều cao: ");
        h = Double.parseDouble(in.nextLine());
        System.out.print("Nhập góc alpha: ");
        a = Double.parseDouble(in.nextLine());
        // Bước 2: kiểm tra
        if(h <= 0 || d <= 0|| a <=0 || a > 90){
            System.out.println("Kích thước không hợp lệ");
            return;
        }
        // Bước 3: Tính diện tích
        dt = d * h /2;

        // Bước 4: Tính diện tích
        double AC = d, BH = h;
        double AB = BH / Math.sin(Math.toRadians(a));

        double AH = Math.sqrt(AB*AB - BH*BH);
        double HC = AC - AH;

        double BC = Math.sqrt(HC*HC + BH*BH);

        cv = (AB + BC + AC);

        // Bước 5: In ra và kết thúc
        System.out.printf("Chu vi là %.2f, diện tích là %.2f \n",cv, dt);

    }
}
