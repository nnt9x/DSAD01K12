package day1.tamgiac1;

public class TamGiac implements HinhHoc2D {
    // Thuộc tính
    private double d;
    private double h;
    private double a;

    // Phương thức khởi tạo

    public TamGiac(double d, double h, double a) {
        // Kiểm tra xem có hợp lệ
        if (h <= 0 || d <= 0 || a <= 0 || a > 90) {
            throw new RuntimeException("Không hợp lệ");
        }
        this.d = d;
        this.h = h;
        this.a = a;
    }

    // Phương thức
    public double dienTich() {
        return h * d / 2;
    }

    public double chuVi() {
        double AC = d, BH = h;
        double AB = BH / Math.sin(Math.toRadians(a));

        double AH = Math.sqrt(AB * AB - BH * BH);
        double HC = AC - AH;

        double BC = Math.sqrt(HC * HC + BH * BH);

        double cv = (AB + BC + AC);
        return cv;
    }

    @Override
    public String toString() {
        return String.format("Chu vi là %.2f, diện tích là %.2f \n",chuVi(), dienTich());
    }
}
