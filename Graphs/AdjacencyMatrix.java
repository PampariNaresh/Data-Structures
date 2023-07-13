class AdjacencyMatrix {
    public static void addEdge(int adj[][], int u, int v) {
        adj[u][v] = 1;
        adj[v][u] = 1;
    }

    public static void printMatrix(int adj[][], int vertexs) {
        for (int i = 0; i < vertexs; i++) {
            for (int j = 0; j < vertexs; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int vertexs = 5;
        int adj[][] = new int[vertexs][vertexs];

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