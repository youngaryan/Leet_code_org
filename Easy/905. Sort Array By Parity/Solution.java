class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0, length = nums.length, end = length-1; 
        int[] sorted = new int[length];

        for (int i = 0; i < length; i++) {
            if(nums[i]%2 == 0){
                sorted[start] = nums[i];
                start++;
            }else{
                sorted[end] = nums[i];
                end--;
            }
        }
        return sorted;
    }
}