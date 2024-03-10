class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] seen = new boolean[right - left + 1];

        for (int i = left; i <= right; i++) {
            for (int[] b : ranges) {
                if (b[0] <= i && b[1] >= i) {
                    seen[i - left] = true;
                    break;
                }
            }
        }

        for (boolean b : seen) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}

// HashSet<Integer> hashSet = new HashSet<>();

// for (int i = left; i <= right; i++) {
// for (int[] is : ranges) {
// if (is[0] <= i && is[1] >= i) {
// hashSet.add(i);
// }
// }
// }

// // System.out.println(j);
// return hashSet.size() == (right - left + 1);