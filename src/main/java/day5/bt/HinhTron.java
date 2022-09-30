package day5.bt;

public class HinhTron implements HinhHoc2D {

    // Thuộc tính
    private double banKinh = 1;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        if (banKinh <= 0) {
            throw new RuntimeException("Bán kính phải dương");
        }
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if (banKinh <= 0) {
            throw new RuntimeException("Bán kính phải dương");
        }
        this.banKinh = banKinh;
    }

    @Override
    public double chuVi() {
        return Math.PI * 2 * banKinh;
    }

    @Override
    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
