package day3;

import java.util.Scanner;

public class Application {
    // Thực thi chính
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option = -1;
        // Lưu số x(cơ số 10)
        long x;
        // Lưu kết quả
        String rs, historyRs;

        // Tạo 1 đối tượng converter
        MyConverter converter = new MyConverter();

        do {
            System.out.println("----MENU----");
            System.out.println("1. Chuyển từ cơ số 10 sang cơ số 2");
            System.out.println("2. Chuyển từ cơ số 10 sang cơ số 8");
            System.out.println("3. Chuyển từ cơ số 10 sang cơ số 16");
            System.out.println("4. Xem lịch sử chuyển đổi");
            System.out.println("5. Thoát");
            System.out.println();
            System.out.print("Nhập lựa chọn: ");
            try{
                option = Integer.parseInt(in.nextLine());
            }
            catch (Exception e){
                System.out.println("Nhập sai định dạng!");
            }

            // Cho vào switch-case
            switch (option){
                case 1:
                    System.out.print("Nhập x(10) = ");
                    x = Long.parseLong(in.nextLine());
                    rs = converter.decToBin(x);
                    // 10(10) = 1010(2)
                    historyRs = String.format("%d(10) = %s(2)", x, rs);
                    // In ra kết quả và lưu vào lịch sử
                    converter.saveStack(historyRs);
                    System.out.println(historyRs);
                    break;
                case 2:
                    System.out.print("Nhập x(10) = ");
                    x = Long.parseLong(in.nextLine());
                    rs = converter.decToOct(x);
                    // 10(10) = 1010(2)
                    historyRs = String.format("%d(10) = %s(8)", x, rs);
                    // In ra kết quả và lưu vào lịch sử
                    converter.saveStack(historyRs);
                    System.out.println(historyRs);
                    break;
                case 3:
                    System.out.print("Nhập x(10) = ");
                    x = Long.parseLong(in.nextLine());
                    rs = converter.decToHex(x);
                    // 10(10) = 1010(2)
                    historyRs = String.format("%d(10) = %s(16)", x, rs);
                    // In ra kết quả và lưu vào lịch sử
                    converter.saveStack(historyRs);
                    System.out.println(historyRs);
                    break;
                case 4:
                    converter.showHistory();
                    break;
                case 5:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }

        }
        while (option != 5);
        in.close();
    }
}
