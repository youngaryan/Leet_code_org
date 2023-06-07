import java.util.HashSet;

import static java.util.Arrays.sort;

public class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Double> re = new HashSet<>();
        sort(nums);
        int j = nums.length-1;

        for (int i = 0; i < nums.length/2; i++) {
            double average = (double) (nums[i] + nums[j]) /2 ;
            j--;
            re.add(average);
        }

        return re.size();
    }


}
