package day5;

public class SoPhuc {
    // VD: 1+2i (i^2 = -1)
    double phanThuc;
    double phanAo;

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    @Override
    public String toString() {
        return String.format("%.2f+%.2fi", phanThuc, phanAo);
    }
}
