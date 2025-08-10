
public class Adjacency {

    public static void addEdge(int[][] mat, int i, int j) {
        mat[i - 1][j - 1] = 1;
        mat[j - 1][i - 1] = 1; // Since the graph is undirected
    }

    public static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int V = 5;
        int[][] mat = new int[V][V];
        int[][] graph = new int[][]{
            {1, 2},
            {2, 3},
            {4, 5},
            {1, 5}
        };

        for (int[] row : graph) {
            addEdge(mat, row[0], row[1]);
        }

        System.out.println("Adjacency Matrix Representation");
        displayMatrix(mat);
    }
}
