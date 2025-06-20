
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {
        int[][] graph = new int[][]{
            {1, 2},
            {0, 2, 3},
            {0, 1, 4},
            {1, 4},
            {2, 3}
        };

        boolean[] visited = new boolean[5];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.err.println(node + " ");

            for (int n : graph[node]) {
                if (!visited[n]) {
                    queue.add(n);
                    visited[n] = true;
                }
            }
        }
    }
}
