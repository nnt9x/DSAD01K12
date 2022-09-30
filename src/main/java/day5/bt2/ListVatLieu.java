package day5.bt2;

import java.util.HashMap;
import java.util.Map;

public class ListVatLieu {

    private ListVatLieu() {
    }

    public static Map<String, Double> getListVatLieu() {
        Map<String, Double> dictionaryVatLieu = new HashMap<>();
        dictionaryVatLieu.put("Fe", 7.8);
        dictionaryVatLieu.put("Al", 2.7);
        dictionaryVatLieu.put("Cu", 8.96);
        dictionaryVatLieu.put("Ag", 10.49);
        return dictionaryVatLieu;
    }
}
