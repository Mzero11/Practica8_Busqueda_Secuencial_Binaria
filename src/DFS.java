import java.util.*;

public class DFS {

    private Graph graph;
    private boolean[] visited;
    private List<Integer> order;

    public DFS(Graph graph) {
        this.graph = graph;
        visited = new boolean[graph.getNumVertices()];
        order = new ArrayList<>();
    }

    public List<Integer> traverse(int start) {
        dfsRecursive(start);
        return order;
    }

    private void dfsRecursive(int u) {
        visited[u] = true;
        order.add(u);

        for (int v : graph.getAdj(u)) {
            if (!visited[v]) {
                dfsRecursive(v);
            }
        }
    }
}
