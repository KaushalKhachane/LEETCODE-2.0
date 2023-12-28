import java.util.*;
class MColoring {
    
    boolean isSafe(int node, List<Integer>[] G, int[] color, int n, int col) {
        for (int it : G[node]) {
            if (color[it] == col) return false;
        }
        return true;
    }

    boolean graphColoring(boolean graph[][], int m, int n) {
        List<Integer>[] G = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            G[i] = new ArrayList<>();
            
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j]) {
                    G[i].add(j);
                    G[j].add(i); // Adding the inverse edge for an undirected graph
                }
            }
        }

        int[] color = new int[n];
        if (graphColoring(G, color, 0, m)) {
            return true;
        } else {
            return false;
        }
    }
    
    boolean graphColoring(List<Integer>[] G, int[] color, int node, int m) {
        int n = G.length;
        if (solve(node, G, color, n, m) == true) return true;
        return false;
    }

    private boolean solve(int node, List<Integer>[] G, int[] color, int n, int m) {
        if (node == n) return true;

        for (int i = 1; i <= m; i++) {
            if (isSafe(node, G, color, n, i)) {
                color[node] = i;
                if (solve(node + 1, G, color, n, m) == true) return true;
                color[node] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        MColoring mColoring = new MColoring();

        // Example: Creating a graph represented by a boolean matrix
        int n = 4; // Number of vertices
        boolean[][] graph = {
                {false, true, true, true},
                {true, false, true, false},
                {true, true, false, true},
                {true, false, true, false}
        };

        int m = 3; // Number of colors

        // Check if graph can be colored with m colors
        boolean result = mColoring.graphColoring(graph, m, n);

        if (result) {
            System.out.println("Graph can be colored with " + m + " colors.");
        } else {
            System.out.println("Graph cannot be colored with " + m + " colors.");
        }
    }

}