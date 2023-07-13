
import java.util.*;

public class DepthFirstSearch {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj, boolean vis[], int node,
            ArrayList<Integer> ans) {

        vis[node] = true;
        ans.add(node);
        for (int neighbour : adj.get(node)) {
            if (vis[neighbour] == false) {

                vis[neighbour] = true;

                dfs(adj, vis, neighbour, ans);
            }
        }
        return ans;

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

        boolean vis[] = new boolean[vertexs];
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> result = dfs(adj, vis, 0, ans);
        for (Integer ele : result) {
            System.out.print(ele + " ");
        }
    }
}
