class Solution {
    public boolean divideArray(int[] nums) {
        int[] hold = new int[501];

        for (int i = 0; i < nums.length; i++) {
            hold[nums[i]]++;
        }

        for (int i : hold) {
            if (i % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}