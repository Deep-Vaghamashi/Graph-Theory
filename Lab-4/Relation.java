
public class Relation {

    public static void main(String[] args) {
        int graph[][] = new int[][]{
            {1, 1, 0, 0},
            {1, 1, 0, 0},
            {0, 0, 1, 1},
            {0, 0, 1, 1}
        };
        int relation = 0;
        int n = graph.length;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                relation++;
                Dfs(i, visited, graph);
            }
        }
        System.out.println("No. Group : " + relation);
    }

    public static void Dfs(int n, boolean visited[], int[][] graph) {
        visited[n] = true;
        for (int i = 0; i < graph[n].length; i++) {
            if (graph[n][i] == 1 && !visited[i]) {
                Dfs(i, visited, graph);
            }
        }

    }
}
