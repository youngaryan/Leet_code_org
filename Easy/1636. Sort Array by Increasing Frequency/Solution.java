import java.util.Arrays;

class Solution {
    public int[] frequencySort(int[] nums) {
        int[] hold = new int[201];
        int[] re = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] += 100;
        }

        for (int i = 0; i < nums.length; i++) {
            hold[nums[i]] += (nums[i] - 100);
        }

        System.out.println(Arrays.toString(hold));
        System.out.println(Arrays.toString(nums));

        System.out.println(hold[99]);

        for (int i = 0; i < hold.length/2; i++) {
            
        }
        return null;
    }
}