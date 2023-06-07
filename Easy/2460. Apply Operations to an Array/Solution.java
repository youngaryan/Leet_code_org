public class Solution {
    public int[] applyOperations(int[] nums) {

        int[] re = new int[nums.length];
        int c = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]){
                nums[i] = 2 * nums[i];
                nums[i+1] = 0;
            }
            if (nums[i] != 0){re[c] = nums[i];c++;}
        }
        if (nums[nums.length-1] != 0 )re[c] = nums[nums.length-1];
        return re;
    }
}
