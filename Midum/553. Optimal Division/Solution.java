class Solution {
    public String optimalDivision(int[] nums) {
        StringBuilder r = new StringBuilder();

        for (int i = nums.length - 1; i > 0; i--) {
            r.append("(");
            r.append(nums[i]);
            r.append("/");
            r.append(")");
        }

        return r.reverse().toString();
    }
}