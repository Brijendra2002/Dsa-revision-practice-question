/**
 * Problem Name: Pacific Atlantic Water Flow
 * Language: Java
 */

import java.util.*;

class Solution {
    public int bfs(int n, List<Integer>[] graph, int source) {
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(source);
        visited[source] = true;

        int count = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            count++;
            for (int next : graph[node]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }

        return count;
    }
}
