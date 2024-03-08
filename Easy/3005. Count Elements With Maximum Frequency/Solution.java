class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] ferq = new int[101];
        int maxFer = 0;

        for (int i : nums) {
            ferq[i]++;
            maxFer = Math.max(maxFer, ferq[i]);
        }

        for (int i : ferq) {
            if (i == maxFer) {
                ferq[0] += i;
            }
        }
        return ferq[0];
    }
}