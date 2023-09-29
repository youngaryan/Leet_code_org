class Solution {
    public boolean isMonotonic(int[] nums) {
        int i = 0, l = nums.length;

        while (i < l - 1 && nums[i + 1] == nums[i]) {
            i++;
        }

        if (i == l - 1)
            return true;

        boolean check = nums[i] < nums[i + 1];

        if (check) {
            while (i < l - 1) {
                if (nums[i + 1] < nums[i]) {
                    return false;
                }
                i++;
            }
            return true;
        }

        while (i < l - 1) {
            if (nums[i + 1] > nums[i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}