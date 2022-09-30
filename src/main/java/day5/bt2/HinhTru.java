package day5.bt2;

public class HinhTru implements HinhHoc3D {

    private double chieuCao = 1;
    private double banKinhDay = 1;

    public HinhTru() {
    }

    public HinhTru(double chieuCao, double banKinhDay) {
        if (chieuCao <= 0 || banKinhDay <= 0) {
            throw new RuntimeException("Canh phai duong");
        }
        this.chieuCao = chieuCao;
        this.banKinhDay = banKinhDay;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        if (chieuCao <= 0) {
            throw new RuntimeException("Canh phai duong");
        }
        this.chieuCao = chieuCao;
    }

    public double getBanKinhDay() {
        return banKinhDay;
    }

    public void setBanKinhDay(double banKinhDay) {
        if (banKinhDay <= 0) {
            throw new RuntimeException("Canh phai duong");
        }
        this.banKinhDay = banKinhDay;
    }

    @Override
    public double tinhTheTich() {
        return Math.PI * banKinhDay * banKinhDay * chieuCao;
    }
}
