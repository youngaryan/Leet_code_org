class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length, prodcut;
        int[] result = new int[len], leftArray = new int[len], rightArray = new int[len];

        leftArray[0] = 1;
        rightArray[len - 1] = 1;

        prodcut = 1;
        for (int i = 1; i < len; i++) {
            prodcut *= nums[i - 1];
            leftArray[i] = prodcut;
        }

        prodcut = 1;
        for (int i = len - 2; i >= 0; i--) {
            prodcut *= nums[i + 1];
            rightArray[i] = prodcut;
        }

        for (int i = 0; i < len; i++) {
            result[i] = leftArray[i] * rightArray[i];
        }
        return result;
    }
}