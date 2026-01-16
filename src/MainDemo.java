import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class MainDemo {

    private static final String RUTA = "src/data/";
    private static final String GRAFO_DIRIGIDO = "g_dirigido_matriz.txt";
    private static final String GRAFO_NODIRIGIDO = "g_nodirigido_matriz.txt";
    private static final String GRAFO_NUEVO = "g_nuevo_matriz.txt";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ DE GRAFOS =====");
            System.out.println("1. Grafo Dirigido");
            System.out.println("2. Grafo No Dirigido");
            System.out.println("3. Nuevo Grafo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ejecutarGrafo(RUTA + GRAFO_DIRIGIDO, true, sc);
                    break;

                case 2:
                    ejecutarGrafo(RUTA + GRAFO_NODIRIGIDO, false, sc);
                    break;

                case 3:
                    File nuevo = new File(RUTA + GRAFO_NUEVO);
                    if (nuevo.exists()) {
                        ejecutarGrafo(RUTA + GRAFO_NUEVO, true, sc);
                    } else {
                        System.out.println(" No existe un nuevo grafo por leer.");
                        System.out.println("   (Archivo esperado: " + GRAFO_NUEVO + ")");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }

    // EJECUCIÓN GENERAL
    private static void ejecutarGrafo(String rutaArchivo, boolean dirigido, Scanner sc) {

        try {
            Graph graph = new Graph(rutaArchivo, dirigido);
            BFS bfs = new BFS(graph);
            DFS dfs = new DFS(graph);

            int n = graph.getNumVertices();

            System.out.print("Ingrese el vértice de origen (1 a " + n + "): ");
            int origen = sc.nextInt();

            if (origen < 1 || origen > n) {
                System.out.println(" Vértice inválido.");
                return;
            }

            int startIndex = origen - 1;

            System.out.println("\n=== RESULTADOS DESDE EL VÉRTICE " + origen + " ===");

            List<Integer> bfsOrder = bfs.traverse(startIndex);
            System.out.print("BFS: ");
            printOrder(bfsOrder);
            bfs.printDistances();

            List<Integer> dfsOrder = dfs.traverse(startIndex);
            System.out.print("DFS: ");
            printOrder(dfsOrder);

        } catch (FileNotFoundException e) {
            System.out.println(" Error al leer el archivo.");
        }
    }

    // IMPRESIÓN 1..n
    private static void printOrder(List<Integer> order) {
        System.out.print("[");
        for (int i = 0; i < order.size(); i++) {
            System.out.print(order.get(i) + 1);
            if (i < order.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
