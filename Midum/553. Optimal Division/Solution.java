class Solution {
    public String optimalDivision(int[] nums) {
        if (nums.length == 1) {
            return Integer.toString(nums[0]);
        }
        if (nums.length == 2) {
            return nums[0] + "/" + nums[1];
        }

        StringBuilder r = new StringBuilder(Integer.toString(nums[0]));
        r.append("/(").append(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            r.append("/").append(nums[i]);
        }
        r.append(")");
        return r.toString();
    }
}