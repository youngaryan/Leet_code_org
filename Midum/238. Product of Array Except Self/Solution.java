class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length, prodcut;
        int[] result = new int[len];

        result[0] = 1;

        prodcut = 1;
        for (int i = 1; i < len; i++) {
            prodcut *= nums[i - 1];
            result[i] = prodcut;
        }

        prodcut = 1;
        for (int i = len - 2; i >= 0; i--) {
            prodcut *= nums[i + 1] ;
            result[i] = prodcut*result[i];
        }

        
        return result;
    }
}