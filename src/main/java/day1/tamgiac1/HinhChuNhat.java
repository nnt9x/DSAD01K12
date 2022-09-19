package day1.tamgiac1;

public class HinhChuNhat implements HinhHoc2D {
    private double chieuDai = 1;
    private double chieuRong = 1;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        if (chieuDai <= 0 || chieuRong <= 0) {
            throw new RuntimeException("Không hợp lệ");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }


    @Override
    public double chuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public double dienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chuVi=" + chuVi() +
                ", dienTich=" + dienTich() +
                '}';
    }
}
