import static java.util.Arrays.sort;

public class Solution {
    public int findMaxK(int[] nums) {
        int i = 0,j = nums.length-1;
        sort(nums);

        while (i<j){
            if (nums[i] + nums[j] == 0)return nums[j];
            if (nums[i] + nums[j] > 0)j--;
            if (nums[i] + nums[j] < 0)i++;
        }
        return -1;
    }
}
