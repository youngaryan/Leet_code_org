class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double golbalMax = Integer.MIN_VALUE;
        int locolMax;

        for (int i = 0; i < nums.length-k+1; i++) {
            locolMax =0;    
            for (int j = i; j < i+k; j++) {
                locolMax += nums[j];
            }
            if(locolMax > golbalMax ) golbalMax = locolMax;
        }

        return golbalMax/k;
    }
}