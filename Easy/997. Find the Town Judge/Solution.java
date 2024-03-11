import java.util.Arrays;

class Solution {
    public int findJudge(int n, int[][] trust) {
        int j = -1;
        int[] ppl = new int[n + 1];
        ppl[0] = -1;
        // System.out.println(Arrays.deepToString(trust));

        for (int[] i : trust) {
            // System.out.println(Arrays.toString(ppl));
            ppl[i[0]] -= 1000;
            ppl[i[1]]++;
        }
        for (int i = 0; i < ppl.length; i++) {
            if (ppl[i] > j) {
                j = i;
            }
        }

        // System.out.println(Arrays.toString(ppl));
        // return ppl[j] >= n - 1 ? j : -1;

        return j == -1 ? -1 : (ppl[j] >= n - 1 ? j : -1);

    }
}