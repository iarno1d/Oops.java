package DSA;

import java.util.*;

class GraphDFS {
    private int V;
    private LinkedList<Integer> adj[];

    GraphDFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) { adj[v].add(w); }

    void dfsUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");
        for(int n : adj[v]) {
            if(!visited[n]) dfsUtil(n, visited);
        }
    }

    void dfs(int v) {
        boolean visited[] = new boolean[V];
        dfsUtil(v, visited);
    }

    public static void main(String[] args) {
        GraphDFS g = new GraphDFS(5);
        g.addEdge(0,1); g.addEdge(0,2);
        g.addEdge(1,3); g.addEdge(2,4);
        g.dfs(0); // 0 1 3 2 4
    }
}
