// import java.util.Arrays;

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0, temPro = 1, i = 0, j = i;

        // System.out.println(Arrays.toString(nums));
        while (j < nums.length) {
            temPro *= nums[i];
            if (temPro >= k) {
                temPro = 1;
                j++;
                i = j;
                continue;
            }
            i++;
            count++;

            if (i == nums.length) {
                temPro = 1;
                j++;
                i = j;
            }
            // System.out.println(count);
        }

        return count;
    }
}