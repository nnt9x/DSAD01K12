package day9;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class WeightGraph<T, W> {
    private Map<T, Map<T, W>> map;

    public WeightGraph() {
        this.map = new HashMap<>();
    }

    public void addVertex(T s) {
        map.put(s, new HashMap<>());
    }

    public void addEdge(T source, T destination, W weight, boolean bidirectional) {
        // Thêm đỉnh - nguồn
        if (!map.containsKey(source)) {
            addVertex(source);
        }

        // Thêm đỉnh - đích
        if (!map.containsKey(destination)) {
            addVertex(destination);
        }

        map.get(source).put(destination, weight);

        if (bidirectional) {
            map.get(destination).put(source, weight);
        }
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        // Lấy toàn bộ đỉnh map.keySet()
        // Từng đỉnh -> map (đích, trọnh số)
        for (T source : map.keySet()) {
            // Lấy ra tưng điỉnh liên kết
            buffer.append(source + ": ");
            for (T destination : map.get(source).keySet()) {
                buffer.append("\t" + destination + "(" + map.get(source).get(destination).toString() + ")");
            }
            buffer.append("\n");
        }

        return buffer.toString();

    }


}
