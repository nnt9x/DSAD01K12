package day5.bt2;

public class MainBT2 {
    public static void main(String[] args) {
        // Tạo 1 số đối tượng
        HinhCau hinhCau = new HinhCau(3);

        // Tạo đối tượng tính toán
        TinhToan tinhToan = new TinhToan();

        // In ra cân nặng
        tinhToan.tinhCanNang(hinhCau, "Fe");
        tinhToan.tinhCanNang(hinhCau,"Al");
    }
}
