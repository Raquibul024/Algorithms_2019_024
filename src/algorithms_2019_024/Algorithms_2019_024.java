package algorithms_2019_024;
import DataStructure.*;
import DataStructure.Search.*;
import DataStructure.Sorting.*;
import GraphAlgorithm.*;
import java.util.Scanner;
/**
 * @author Md.Raquibul Hassan
 */
public class Algorithms_2019_024 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("================ (Algorithm) ===============");
        System.out.println(""
                + "\t1) Data Structure \n"
                + "\t2) Algorithms");
        System.out.print("Enter your choice: ");
        int choice = s.nextInt();
        System.out.println("============================================");

        if (choice == 1) {
            boolean t = true;
            while(t){
            System.out.println("================ (Data Structure) ===============");
            System.out.println(""
                    + "\t01.Bubble sort\n"
                    + "\t02.Insertion sort\n"
                    + "\t03.Selection sort\n"
                    + "\t04.Merge sort\n"
                    + "\t05.Quick sort\n"
                    + "\t06.Counting sort\n"
                    + "\t07.Radix sort\n"
                    + "\t08.Heap sort\n"
                    + "\t09.Bin sort\n"
                    + "\t10.Shell sort\n"
                    + "\t11.Linear search\n"
                    + "\t12.Binary search\n"
                    + "\t13.Euclidean GCD Algorithm\n"
                    + "\t14.Universal hashing\n"
                    + "\t15.Stack\n"
                    + "\t16.Queue\n"
                    + "\t17.Linked List\n"
                    + "\t18.Fibonacci Numbers\n"
                    + "\t19.Recurrence");
            System.out.print("Enter your choice: ");
            int c1 = s.nextInt(); // to input

            switch (c1) {
                case 0:
                    t = false;
                    break;
                case 1:
                   BubbleSort b = new BubbleSort(); // create BubbleSort object
                   b.bubble_sort(); // call bubble_sort method
                    break;
                case 2:
                    InsertionSort insert = new InsertionSort();
                    insert.Insertion_Sort();
                    break;
                case 3:
                    SelectionSort sel = new SelectionSort();
                    sel.Selection_Sort();
                    break;
                case 4:
                    MergeSort msort = new MergeSort();
                    msort.run();
                    break;
                case 5:
                    QuickSort qsort = new QuickSort();
                    qsort.run();
                    break;
                case 6:
                    CountingSort count = new CountingSort();
                    count.Count_Sort();
                    break;
                case 7:
                    RadixSort rsort = new RadixSort();
                    rsort.run();
                    break;
                case 8:
                    HeapSort heap = new HeapSort();
                    heap.Heap_Sort();
                    break;
                case 9:
                    break;
                case 10:
                    ShellSort shel = new ShellSort();
                    shel.Shell_Sort();
                    break;
                case 11:
                    LinearSearch lin = new LinearSearch();
                    lin.Linear_Search();
                    break;
                case 12:
                    BinarySearch bin = new BinarySearch();
                    bin.Binary_Search();
                    break;
                case 13:
                    EuclidGCD gcd = new EuclidGCD();
                    gcd.Euclid_GCD();
                    break;
                case 14:
                    break;
                case 15:
                    StackOp st = new StackOp();
                    st.stack();
                    break;
                case 16:
                    QueueOp q = new QueueOp();
                    q.queue();
                    break;
                case 17:
                    break;
                case 18:
                    Fibonacci fibo = new Fibonacci();
                    fibo.fibonacci();
                    break;
                case 19:
                    Recurrence rec = new Recurrence();
                    rec.recur();
                    break;
                default:
                    System.out.println("Invalid input!!! Please enter valid input");
                    break;

            }
            }
        }
        if (choice == 2) {
            System.out.println("================ (Algorithm) ===============");
            System.out.println(""
                    + "\t01.Largest common subsequence \n "
                    + "\t02.Optimal Binary Search Tree \n "
                    + "\t03.Matrix chain multiplication \n "
                    + "\t04.Strassens's matrix multiplication \n "
                    + "\t05.BFS \n "
                    + "\t06.DFS \n "
                    + "\t07.DAG \n "
                    + "\t08.Longest increasing subsequence \n "
                    + "\t09.Topological sort \n "
                    + "\t10.Krushkal's algorithm \n "
                    + "\t11.Prim's algorithm \n "
                    + "\t12.Dijkastra's algorithm \n "
                    + "\t13.Bellman ford's algorithm \n "
                    + "\t14.Warshall's algorithm \n "
                    + "\t15.(0,1) Knapsack problem \n "
                    + "\t16.Naive string matching algorithm \n "
                    + "\t17.Rabin krap string matching algorithm \n "
                    + "\t18.Activity selection problem \n "
                    + "\t19.Recurrence \n "
                    + "\t20.Max flow min cut");
            System.out.print("Enter your choice: ");
            int c1 = s.nextInt();

            switch (c1) {
                case 1:
                    LCS lcs = new LCS();
                    lcs.run();
                    break;
                case 2:
                    OBST obst = new OBST();
                    obst.run();
                    break;
                case 3:
                    MatrixChainMult cMult = new MatrixChainMult();
                    cMult.run();
                    break;
                case 4:
                    break;
                case 5:
                    BFS gbfs = new BFS();
                    gbfs.gBFS();
                    break;
                case 6:
                    DFS gdfs = new DFS();
                    gdfs.gDFS();
                    break;
                case 7:
                    break;
                case 8:
                    LIS lis = new LIS();
                    lis.run();
                    break;
                case 9:
                    TopologicalSort tSort = new TopologicalSort(0);
                    tSort.run();
                    break;
                case 10:
                    Kruskals krus = new Kruskals(0,0);
                    krus.run();
                    break;
                case 11:
                    Prims prim = new Prims();
                    prim.run();
                    break;
                case 12:
                    DijkstraAlgo dij = new DijkstraAlgo();
                    dij.run();
                    break;
                case 13:
                    BellmanFord bFord = new BellmanFord();
                    bFord.run();
                    break;
                case 14:
                    FloydWarshall fWarshall = new FloydWarshall();
                    fWarshall.run();
                    break;
                case 15:
                    KnapSack knap = new KnapSack();
                    knap.run();
                    break;
                case 16:
                    NaivePSearch nPtr = new NaivePSearch();
                    nPtr.run();
                    break;
                case 17:
                    break;
                case 18:
                    break;
                case 19:
                    break;
                case 20:
                    break;
                default:
                    break;
            }

        } else {
            System.out.println("Invalid");
        }
    }
    
}
