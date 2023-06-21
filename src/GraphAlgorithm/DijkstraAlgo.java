package GraphAlgorithm;
import java.util.*;

public class DijkstraAlgo {
    private static final int MAX = Integer.MAX_VALUE; // Maximum value to represent infinity

    public void dijkstra(int[][] graph, int start) {
        int V = graph.length; // Number of vertices in the graph

        // Create arrays to store the distances and visited status of vertices
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];

        // Initialize all distances to infinity and visited status to false
        for (int i = 0; i < V; i++) {
            dist[i] = MAX;
            visited[i] = false;
        }

        // Set the distance of the start vertex to 0
        dist[start] = 0;

        // Traverse all vertices
        for (int count = 0; count < V - 1; count++) {
            // Find the vertex with the minimum distance that has not been visited
            int minVertex = -1;
            int minDist = MAX;
            for (int v = 0; v < V; v++) {
                if (!visited[v] && dist[v] < minDist) {
                    minVertex = v;
                    minDist = dist[v];
                }
            }

            // Mark the minimum distance vertex as visited
            visited[minVertex] = true;

            // Update the distances of the adjacent vertices
            for (int v = 0; v < V; v++) {
                if (!visited[v] && graph[minVertex][v] != 0 && dist[minVertex] + graph[minVertex][v] < dist[v]) {
                    dist[v] = dist[minVertex] + graph[minVertex][v];
                }
            }
        }

        // Print the distances
        System.out.println("Vertex\tDistance");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t" + dist[i]);
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
System.out.println("\u001B[34m============== Dijkstra Algorithm ==============\u001B[0m");
        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();

        // Create the adjacency matrix for the graph
        int[][] graph = new int[V][V];

        System.out.println("Enter the adjacency matrix (enter 0 for no edge):");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the start vertex: ");
        int start = scanner.nextInt();

        DijkstraAlgo dijkstraAlgorithm = new DijkstraAlgo();
        dijkstraAlgorithm.dijkstra(graph, start);
    }
}
