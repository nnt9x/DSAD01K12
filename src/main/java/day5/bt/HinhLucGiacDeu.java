package day5.bt;

public class HinhLucGiacDeu implements HinhHoc2D {

    public double canh = 1;

    public HinhLucGiacDeu() {
    }

    public HinhLucGiacDeu(double canh) {
        if (canh <= 0) {
            throw new RuntimeException("Canh phai duong");
        }
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        if (canh <= 0) {
            throw new RuntimeException("Canh phai duong");
        }
        this.canh = canh;
    }

    @Override
    public double chuVi() {
        return 6 * canh;
    }

    @Override
    public double dienTich() {
        return (3 * Math.sqrt(3) * canh * canh) / 2;
    }
}
