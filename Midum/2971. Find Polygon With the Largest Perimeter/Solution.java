import java.util.Arrays;

class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        // System.out.println(Arrays.toString(nums));

        long currSum = nums[0] + nums[1] + nums[2];
        int i = 3;
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