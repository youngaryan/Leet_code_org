class Solution {
    //3ms
    public int[] rearrangeArray(int[] nums) {
        int l = 0, k = 1, len = nums.length;
        int[] res = new int[len];

        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                res[l] = nums[i];
                l += 2;
            } else {
                res[k] = nums[i];
                k += 2;
            }
        }
        return res;
    }
}

/*
 * 5ms
 * class Solution {
 * public int[] rearrangeArray(int[] nums) {
 * int l = 0, k = 0, len = nums.length;
 * int[] pos = new int[len/ 2], neg = new int[len / 2];
 * 
 * for (int i : nums) {
 * if (i < 0) {
 * neg[k] = i;
 * k++;
 * } else {
 * pos[l] = i;
 * l++;
 * }
 * }
 * 
 * l = 0;
 * k = 0;
 * 
 * for (int i = 0; i < len; i++) {
 * if (i % 2 == 0) {
 * nums[i] = pos[l];
 * l++;
 * } else {
 * nums[i] = neg[k];
 * k++;
 * }
 * }
 * 
 * return nums;
 * }
 * }
 */