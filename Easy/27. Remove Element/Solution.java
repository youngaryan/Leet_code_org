

public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length==0)return 0;
        int c =0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }
}
