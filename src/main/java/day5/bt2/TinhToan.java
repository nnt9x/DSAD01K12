package day5.bt2;

import java.util.Map;

public class TinhToan {
    public <T extends HinhHoc3D> void tinhCanNang(T t, String vatLieu) {
        double theTich = t.tinhTheTich();
        // khối lượng = thể tích * khối lượng riêng

        Map<String, Double> listVatLieu = ListVatLieu.getListVatLieu();

        double khoiLuongRieng = -1;
        if (listVatLieu.containsKey(vatLieu)) {
            khoiLuongRieng = listVatLieu.get(vatLieu);
        } else {
            throw new RuntimeException("Không có vật liệu đó");
        }

        double kg = theTich * khoiLuongRieng;

        String out = String.format("Hình %s, có thể tích %.2f cm3, vật liệu %s, khối lượng là %.2f g",
                t.getClass().getSimpleName(), t.tinhTheTich(), vatLieu, kg);
        System.out.println(out);
    }
}
