class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length, l = 0, r = len - 1, lSq, rSq;

        int[] res = new int[len];

        while (l <= r) {
            lSq = nums[l] * nums[l];
            rSq = nums[r] * nums[r];

            if (lSq > rSq) {
                res[len - 1] = lSq;
                l++;
            } else {
                res[len - 1] = rSq;
                r--;
            }
            len--;

        }

        return res;
    }
}