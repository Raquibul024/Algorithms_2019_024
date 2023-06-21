package GraphAlgorithm;

import java.util.*;


public class Prims {
    private int V;
    int minKey(int key[], Boolean mstSet[]) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++)
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }

        return minIndex;
    }

    void printMST(int parent[], int graph[][]) {
        System.out.println("\nEdge \t\tWeight");
        int cost = 0;
        for (int i = 1; i < V; i++){
            System.out.println(parent[i] + " <--> " + i + "\t" + graph[i][parent[i]]);
            cost += graph[i][parent[i]];
        }
        System.out.println("\033[1mMinimum cost is: "+cost);
    }

    void primMST(int graph[][]) {
        int parent[] = new int[V];
        int key[] = new int[V];
        Boolean mstSet[] = new Boolean[V];

        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        key[0] = 0;
        parent[0] = -1;

        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;

            for (int v = 0; v < V; v++)
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
        }

        printMST(parent, graph);
    }

    public void run() {
        System.out.println("============== Prims Algorithm ==============");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        V = scanner.nextInt();

        int graph[][] = new int[V][V];
        System.out.println("Enter the adjacency matrix of the graph:");

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }
        primMST(graph);
    }

}
