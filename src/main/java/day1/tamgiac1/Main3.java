package day1.tamgiac1;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        HinhHoc2D tamGiac = new TamGiac(3,4,90);
        HinhHoc2D hcn  = new HinhChuNhat(4,5);

        // Tạo 1 mảng HinhHoc2D
        List<HinhHoc2D> mangHinhHoc = new ArrayList<>();
        mangHinhHoc.add(tamGiac);
        mangHinhHoc.add(hcn);

        // In ra chu vi, diện tích của tất cả hình học 2D đang có list
        for (HinhHoc2D hinhHoc: mangHinhHoc) {
            System.out.println(hinhHoc.toString());
        }

    }
}
