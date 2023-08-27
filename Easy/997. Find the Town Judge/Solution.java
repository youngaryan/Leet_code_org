import java.util.ArrayList;

class Solution {
    public int findJudge(int n, int[][] trust) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> notTrusted = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        for (int i = 0; i < trust.length; i++) {
            if (list.contains(trust[i][0])) {
                notTrusted.add(trust[i][0]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (!notTrusted.contains(list.get(i))) {
                return list.get(i);
            }
        }

        return -1;

    }
}