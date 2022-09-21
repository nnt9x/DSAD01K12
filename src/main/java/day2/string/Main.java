package day2.string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = Integer.parseInt(in.nextLine());
        // Tạo mảng String
        String arr[] = new String[n];
        // Nhập mảng
        for(int i = 0; i < n; i++){
            System.out.printf("arr[%d] = ", i);
            arr[i] = in.nextLine();
        }
        // In ra mảng vừa nhập
        System.out.println("Mảng vừa nhập: ");
        for(int i = 0; i < n; i++){
            System.out.printf("arr[%d] = \"%s\" \n", i, arr[i]);
        }
        // Lưu vị trí max, và lengthMax?
        int maxIndex = 0;
        int lengthMax = arr[0].length();

        for(int i = 1; i < n; i++){
            if(arr[i].length() > lengthMax){
                // gán lại kích thước max
                lengthMax = arr[i].length();
                // Gán lại vị trí max
                maxIndex = i;
            }
        }
        // Kết luận
        System.out.printf("Chuỗi dài nhất là \"%s\" ở vị trí %d "
        , arr[maxIndex], maxIndex);

    }
}
