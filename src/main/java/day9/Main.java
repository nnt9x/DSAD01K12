package day9;

public class Main {
    public static void main(String[] args)
    {

        Graph<Integer> g = new Graph<>();

        g.addEdge(0, 1, true);
        g.addEdge(0, 4, true);
        g.addEdge(1, 2, true);
        g.addEdge(1, 3, true);
        g.addEdge(1, 4, true);
        g.addEdge(2, 3, true);
        g.addEdge(3, 4, true);

        System.out.println("Graph:\n" + g);

        g.getVertexCount();

        g.getEdgesCount(true);

        g.hasEdge(3, 4);

        g.hasVertex(5);


//        Graph<FacebookAccount> graph = new Graph<>();
//
//        FacebookAccount A = new FacebookAccount(1,"A", 20);
//        FacebookAccount B = new FacebookAccount(2,"B", 21);
//        FacebookAccount C = new FacebookAccount(3,"C", 22);
//        FacebookAccount D = new FacebookAccount(4,"D", 23);
//        FacebookAccount E = new FacebookAccount(5,"E", 24);
//
//        graph.addEdge(A, B, true);
//        graph.addEdge(B, C, false);
//        graph.addEdge(C, D, false);
//        graph.addEdge(A, E, true);
//        graph.addEdge(C, E,false);
//
//        System.out.println(graph);
    }
}
