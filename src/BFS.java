import java.util.*;

public class BFS {

    private Graph graph;
    private int[] dist;

    public BFS(Graph graph) {
        this.graph = graph;
        this.dist = new int[graph.getNumVertices()];
        Arrays.fill(dist, -1);
    }

    public List<Integer> traverse(int start) {
        boolean[] visited = new boolean[graph.getNumVertices()];
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> order = new ArrayList<>();

        visited[start] = true;
        dist[start] = 0;
        queue.add(start);

        while (!queue.isEmpty()) {
            int u = queue.poll();
            order.add(u);

            for (int v : graph.getAdj(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    dist[v] = dist[u] + 1;
                    queue.add(v);
                }
            }
        }
        return order;
    }

    public void printDistances() {
        System.out.println("Distancias BFS:");
        for (int i = 0; i < dist.length; i++) {
            System.out.println("Vértice " + (i + 1) + " -> " + dist[i]);
        }
    }
}
