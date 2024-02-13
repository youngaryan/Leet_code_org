class Solution {
    public boolean increasingTriplet(int[] nums) {

        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;

        for (int j2 = 0; j2 < nums.length; j2++) {
            if (nums[j2] <= i) {
                i = nums[j2];
            }
            if (nums[j2] <= j) {
                j = nums[j2];
            } else {
                return true;
            }
        }
        return false;
    }
}