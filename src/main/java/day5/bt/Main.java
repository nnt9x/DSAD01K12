package day5.bt;

public class Main {
    public static void main(String[] args) {
        Draw2D draw2D = new Draw2D();
        // Tạo ra 1 số đối tượng cụ thể
        HinhTron hinhTron = new HinhTron(3);
        HinhVuong hinhVuong = new HinhVuong(5);

        HinhLucGiacDeu hinhLucGiacDeu = new HinhLucGiacDeu(3);

        draw2D.draw(hinhTron);
        draw2D.draw(hinhVuong);
        draw2D.draw(hinhLucGiacDeu);
    }
}
