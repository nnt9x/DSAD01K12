package day9;

public class Main2 {
    public static void main(String[] args) {
        WeightGraph<Integer, Double> weightGraph= new WeightGraph<>();
        weightGraph.addEdge(1,2, 2.0, false);
        weightGraph.addEdge(2, 1, 10.0, false);
        weightGraph.addEdge(3, 1, 12.0, false);
        weightGraph.addEdge(3, 4, 4.0, false);
        weightGraph.addEdge(5, 3, 3.0, false);
        weightGraph.addEdge(2, 3, 7.0, false);

        System.out.println(weightGraph);
    }
}
