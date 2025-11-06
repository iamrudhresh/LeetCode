import java.util.*;
public class Solution {
    private Map<Integer, TreeSet<Integer>> mp = new HashMap<>();

    private void dfs(int node, List<Integer>[] adj, boolean[] visited, int id, int[] ids) {
        visited[node] = true;
        ids[node] = id;
        mp.computeIfAbsent(id, k -> new TreeSet<>()).add(node);
        for (int nei : adj[node]) {
            if (!visited[nei]) {
                dfs(nei, adj, visited, id, ids);
            }
        }
    }

    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        @SuppressWarnings("unchecked")
        List<Integer>[] adj = new ArrayList[c + 1];
        for (int i = 1; i <= c; i++) adj[i] = new ArrayList<>();
        for (int[] e : connections) {
            int u = e[0], v = e[1];
            adj[u].add(v);
            adj[v].add(u);
        }

        boolean[] visited = new boolean[c + 1];
        int[] ids = new int[c + 1];
        for (int i = 1; i <= c; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, i, ids); 
            }
        }

        List<Integer> out = new ArrayList<>();
        for (int[] q : queries) {
            int type = q[0];
            int node = q[1];
            int compId = ids[node];
            TreeSet<Integer> set = mp.getOrDefault(compId, new TreeSet<>());

            if (type == 1) {
                if (set.contains(node)) {
                    out.add(node);
                } else if (!set.isEmpty()) {
                    out.add(set.first()); 
                } else {
                    out.add(-1);
                }
            } else if (type == 2) {
                set.remove(node);
            }
        }

        int[] ans = new int[out.size()];
        for (int i = 0; i < out.size(); i++) ans[i] = out.get(i);
        return ans;
    }
}