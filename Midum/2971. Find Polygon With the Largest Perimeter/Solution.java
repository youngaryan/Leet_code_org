import java.util.Arrays;

class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        // System.out.println(Arrays.toString(nums));

        long currSum = 0;
        int i = 0;
        // System.out.println(currSum);

        while (i < nums.length) {
            currSum += nums[i];
            i++;
        }
        i = nums.length;
        while (i > 2) {
            i--;
            long t = currSum / 2;
            if (currSum - nums[i] > t) {
                return currSum;
            }
            currSum -= nums[i];

        }

        return -1;
    }
}