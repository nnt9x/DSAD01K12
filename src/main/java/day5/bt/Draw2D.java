package day5.bt;

public class Draw2D {
    public Draw2D() {

    }

    public <T extends HinhHoc2D> void draw(T t) {
        String out = String.format("Vẽ hình %s, có diện tích là %.2f cm2, chu vi là %.2f cm",
                t.getClass().getSimpleName(), t.dienTich(), t.chuVi());
        System.out.println(out);
    }
}
