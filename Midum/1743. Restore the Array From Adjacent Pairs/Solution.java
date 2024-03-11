import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {

        HashMap<Integer, List<Integer>> graph = new HashMap<>();

        for (int[] p : adjacentPairs) {
            graph.computeIfAbsent(p[0], x -> new ArrayList<>()).add(p[1]);
            graph.computeIfAbsent(p[1], x -> new ArrayList<>()).add(p[0]);
        }

        int length = adjacentPairs.length + 1;
        int[] result = new int[length];
        HashSet<Integer> seen = new HashSet<>();

        for (Integer node : graph.keySet()) {
            if (graph.get(node).size() == 1) {
                result[0] = node;
                seen.add(node);
                break;
            }
        }

        dfs(graph, result, seen, 0);

        return result;
    }

    private void dfs(HashMap<Integer, List<Integer>> graph, int[] result, HashSet<Integer> seen, int index) {
        if (index == result.length - 1) {
            return;
        }

        int curr = result[index];

        for (int i : graph.get(curr)) {
            if (!seen.contains(i)) {
                seen.add(i);
                result[index + 1] = i;
                dfs(graph, result, seen, index + 1);
            }
        }
    }
}