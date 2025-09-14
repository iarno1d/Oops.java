package DSA;

import java.util.*;

class GraphBFS {
    private int V;
    private LinkedList<Integer> adj[];

    GraphBFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) { adj[v].add(w); }

    void bfs(int s) {
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);

        while(!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for(int n : adj[node]) {
                if(!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphBFS g = new GraphBFS(5);
        g.addEdge(0,1); g.addEdge(0,2);
        g.addEdge(1,3); g.addEdge(2,4);
        g.bfs(0); // 0 1 2 3 4
    }
}
