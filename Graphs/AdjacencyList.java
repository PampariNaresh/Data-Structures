
import java.util.*;

public class AdjacencyList {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void printMatrix(ArrayList<ArrayList<Integer>> adj, int vertexs) {
        for (int i = 0; i < vertexs; i++) {
            System.out.print(i + "-->");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + "-->");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int vertexs = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(vertexs);
        for (int i = 0; i < vertexs; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        printMatrix(adj, vertexs);
    }
}

/*
 * import java.util.*;
 * 
 * class Node {
 * int index;
 * int element;
 * 
 * Node(int index, int element) {
 * this.index = index;
 * this.element = element;
 * }
 * }
 * 
 * public class AdjacencyList {
 * public static void addEdge(ArrayList<ArrayList<Node>> adj, int u, int v) {
 * adj.get(u).add(new Node(u, v));
 * adj.get(v).add(new Node(v, u));
 * }
 * 
 * public static void printMatrix(ArrayList<ArrayList<Node>> adj, int vertexs) {
 * for (int i = 0; i < vertexs; i++) {
 * for (int j = 0; j < adj.get(i).size(); j++) {
 * System.out.print(adj.get(i).get(j).index + "-->" + adj.get(i).get(j).element
 * + " ");
 * }
 * System.out.println();
 * }
 * }
 * 
 * public static void main(String args[]) {
 * int vertexs = 5;
 * ArrayList<ArrayList<Node>> adj = new ArrayList<>(vertexs);
 * for (int i = 0; i < vertexs; i++) {
 * adj.add(new ArrayList<>());
 * }
 * 
 * addEdge(adj, 0, 1);
 * addEdge(adj, 0, 4);
 * addEdge(adj, 1, 2);
 * addEdge(adj, 1, 3);
 * addEdge(adj, 1, 4);
 * addEdge(adj, 2, 3);
 * addEdge(adj, 3, 4);
 * printMatrix(adj, vertexs);
 * }
 * }
 */