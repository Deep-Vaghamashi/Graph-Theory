
import java.util.*;

public class DFS {

    static int[][] graph = new int[][]{
        {1, 2}, {0, 2}, {0, 1, 3, 4}, {2}, {2}
    };
    static boolean[] visited = new boolean[5];

    public static void main(String[] args) {
        int[][] graph = new int[][]{
            {1, 2}, {0, 2}, {0, 1, 3, 4}, {2}, {2}
        };

        boolean[] visited = new boolean[5];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        visited[0] = true;

        while (!stack.isEmpty()) {
            int ans = stack.pop();
            System.out.print(ans + " ");

            int neighbors[] = graph[ans];
            for (int n = neighbors.length - 1; n >= 0; n--) {
                if (!visited[neighbors[n]]) {
                    stack.push(neighbors[n]);
                    visited[neighbors[n]] = true;
                }
            }
        }

        System.out.println();
        DFSReg(0);
    }

    public static void DFSReg(int n) {
        visited[n] = true;
        System.out.print(n + " ");
        for (int i : graph[n]) {
            if (!visited[i]) {
                DFSReg(i);
            }
        }
    }
}
