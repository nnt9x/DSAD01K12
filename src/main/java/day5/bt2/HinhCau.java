package day5.bt2;

public class HinhCau implements HinhHoc3D {
    private double banhKinh = 1;

    public HinhCau() {
    }

    public HinhCau(double banhKinh) {
        if (banhKinh <= 0) {
            throw new RuntimeException("Bán kính phải dương");
        }
        this.banhKinh = banhKinh;
    }

    public double getBanhKinh() {
        return banhKinh;
    }

    public void setBanhKinh(double banhKinh) {
        if (banhKinh <= 0) {
            throw new RuntimeException("Bán kính phải dương");
        }
        this.banhKinh = banhKinh;
    }

    @Override
    public double tinhTheTich() {
        return 4 * Math.PI * banhKinh * banhKinh * banhKinh / 3;
    }
}
