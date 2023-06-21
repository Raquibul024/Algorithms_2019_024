package GraphAlgorithm;
import java.util.*;

public class Graph {
   
    private LinkedList<Integer>[] adjList;

    void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src);
    }

    public void GraphImp() {
        System.out.println("============== Graph implementation ==============");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of vertices and edges: ");

        int v = s.nextInt();
        int e = s.nextInt();
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<Integer>();
        }

        System.out.println("Enter edges: ");
        for (int i = 0; i < e; i++) {
            int ed = i + 1;
            System.out.println("Edge- " + ed + ": ");
            int src = s.nextInt();
            int des = s.nextInt();
            addEdge(src, des);
        }
    }

    public LinkedList<Integer>[] getAdjList() {
        return adjList;
    } 
}
