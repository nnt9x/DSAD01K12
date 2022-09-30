package day5.bt;

public class HinhVuong implements HinhHoc2D {
    // Thuộc tính
    private double canh = 1;

    // Tạo ra constructor
    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        if (canh <= 0) {
            throw new RuntimeException("Kích thước cạnh phải dương");
        }
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        if (canh <= 0) {
            throw new RuntimeException("Kích thước cạnh phải dương");
        }
        this.canh = canh;
    }

    @Override
    public double chuVi() {
        return canh * 4;
    }

    @Override
    public double dienTich() {
        return canh * canh;
    }
}
