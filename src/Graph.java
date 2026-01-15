import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Graph {

    private int nVertices;
    private boolean directed;
    private List<List<Integer>> adj;

    public Graph(String filePath, boolean directed) throws FileNotFoundException {
        this.directed = directed;
        loadFromMatrix(filePath);
    }

    private void loadFromMatrix(String filePath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));
        List<int[]> matrix = new ArrayList<>();

        while (sc.hasNextLine()) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            int[] row = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                row[i] = Integer.parseInt(parts[i]);
            }
            matrix.add(row);
        }

        nVertices = matrix.size();
        adj = new ArrayList<>();

        for (int i = 0; i < nVertices; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < nVertices; i++) {
            for (int j = 0; j < nVertices; j++) {
                if (matrix.get(i)[j] == 1) {
                    addEdge(i, j);
                }
            }
        }
    }

    private void addEdge(int u, int v) {
        adj.get(u).add(v);
        if (!directed && u != v) {
            adj.get(v).add(u);
        }
    }

    public int getNumVertices() {
        return nVertices;
    }

    public List<Integer> getAdj(int v) {
        return adj.get(v);
    }
}
