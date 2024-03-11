import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] findMode(TreeNode root) {

        HashMap<Integer, Integer> map = new HashMap<>();
        treverse(map, root);

        int m = -1;

        for (Integer i : map.values()) {
            if (i > m) {
                m = i;
            }
        }

        ArrayList<Integer> modes = new ArrayList<>();

        for (Integer i : map.keySet()) {
            if (map.get(i) == m) {
                modes.add(i);
            }
        }

        int[] r = new int[modes.size()];

        for (int i = 0; i < r.length; i++) {
            r[i] = modes.get(i);
        }
        return r;
    }

    private void treverse(HashMap<Integer, Integer> map, TreeNode node) {
        if (node == null) {
            return;
        }

        map.put(node.val, map.getOrDefault(node.val, 0) + 1);
        treverse(map, node.left);
        treverse(map, node.right);
    }
}