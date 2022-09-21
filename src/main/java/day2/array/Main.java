package day2.array;

import java.util.Scanner;

public class Main {

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        // Khai báo kích thước n
        int n;
        // Nhập n từ bàn phím
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập n = ");
        n = Integer.parseInt(in.nextLine());
        // Tạo mảng kích thước n
        int arr[] = new int[n];

        // Nhập giá trị
        for (int i = 0; i < n; i++) {
            arr[i] = getRandomNumber(1, 10000);
        }
        // In ra mảng vừa nhập
        System.out.print("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + arr[i]);
        }
        System.out.println("\n");

        // In ra phần tử đầu tiên và cuối cùng?
        System.out.printf("Phần tử đầu tiên %d, cuối cùng %d \n",
                arr[0], arr[n -1]
                );
        // Hoán đổi giá trị 2 phần tử đầu và cuối
        int tmp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = tmp;

        System.out.print("Mảng vừa sau khi hoán đổi là: ");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + arr[i]);
        }
        System.out.println("\n");

    }
}
