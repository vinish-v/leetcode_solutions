import java.util.*;

class Solution {
    public int minScore(int n, int[][] roads) {
        // Step 1: Build the adjacency list
        // Each entry will store: [neighboring_city, road_distance]
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int[] road : roads) {
            adj.get(road[0]).add(new int[]{road[1], road[2]});
            adj.get(road[1]).add(new int[]{road[0], road[2]}); // Bidirectional
        }
        
        // Step 2: BFS Initialization
        int minScore = Integer.MAX_VALUE;
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(1);
        visited[1] = true;
        
        // Step 3: Traverse the connected component
        while (!queue.isEmpty()) {
            int u = queue.poll();
            
            for (int[] neighbor : adj.get(u)) {
                int v = neighbor[0];
                int distance = neighbor[1];
                
                // Track the minimum edge seen in this component
                minScore = Math.min(minScore, distance);
                
                if (!visited[v]) {
                    visited[v] = true;
                    queue.offer(v);
                }
            }
        }
        
        return minScore;
    }
}