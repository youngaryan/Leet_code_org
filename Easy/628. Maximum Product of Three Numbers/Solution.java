import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length - 1;

        int m1 = nums[l] * nums[l - 1] * nums[l - 2];
        int m2 = nums[0] * nums[1] * nums[l];

        return m1 > m2 ? m1 : m2;

    }
}