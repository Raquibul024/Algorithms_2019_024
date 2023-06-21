package GraphAlgorithm;

import java.util.Scanner;


public class BellmanFord {
    static void BellmanFord(int graph[][], int V, int E,
                int src)
{
    // Initialize distance of all vertices as infinite.
    int []dis = new int[V];
    for (int i = 0; i < V; i++)
        dis[i] = Integer.MAX_VALUE;
 
    // initialize distance of source as 0
    dis[src] = 0;
 
    // Relax all edges |V| - 1 times. A simple
    // shortest path from src to any other
    // vertex can have at-most |V| - 1 edges
    for (int i = 0; i < V - 1; i++)
    {
 
        for (int j = 0; j < E; j++)
        {
            if (dis[graph[j][0]] != Integer.MAX_VALUE && dis[graph[j][0]] + graph[j][2] <
                            dis[graph[j][1]])
                dis[graph[j][1]] =
                dis[graph[j][0]] + graph[j][2];
        }
    }
 
    // check for negative-weight cycles.
    // The above step guarantees shortest
    // distances if graph doesn't contain
    // negative weight cycle. If we get a
    // shorter path, then there is a cycle.
    for (int i = 0; i < E; i++)
    {
        int x = graph[i][0];
        int y = graph[i][1];
        int weight = graph[i][2];
        if (dis[x] != Integer.MAX_VALUE &&
                dis[x] + weight < dis[y])
            System.out.println("Graph contains negative"
                    +" weight cycle");
    }
 
    System.out.println("\n\u001B[34mVertex Distance from Source\u001B[0m");
    for (int i = 0; i < V; i++)
        System.out.println(i + "\t\t" + dis[i]);
}
 
// Driver code
public void run()
{
    System.out.println("\u001B[34m============== BellmanFord's Algorithm ==============\u001B[0m");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int V = s.nextInt();
        System.out.print("Enter the number of edges: ");
        int E = s.nextInt();
        
        
       int[][] graph = new int[E][3];

    System.out.println("Enter the edges in the format (source, destination, weight):");
    for (int i = 0; i < E; i++) {
        System.out.print("Edge " + (i + 1) + ": ");
        graph[i][0] = s.nextInt();
        graph[i][1] = s.nextInt();
        graph[i][2] = s.nextInt();
    }

    System.out.print("Enter the source vertex: ");
    int src = s.nextInt();

    BellmanFord(graph, V, E, src);
    }
}
