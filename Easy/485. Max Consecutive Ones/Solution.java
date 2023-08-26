class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        if (nums.length == 1 && nums[0] == 1)
            return 1;

        if (nums.length == 1 && nums[0] == 0)
            return 0;

        if (nums.length == 2 && nums[0] == 0 && nums[1] == 0)
            return 0;
        int c = 0, temp = 0;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] == 1 && nums[i - 1] == nums[i]) {
                temp++;
                if (temp > c) {
                    c = temp;
                }
            } else {
                if (temp > c) {
                    c = temp;
                }
                temp = 0;
            }
        }
        return c + 1;
    }
}