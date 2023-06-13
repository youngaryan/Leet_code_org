import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> re = new ArrayList<>();

        int k =0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i-1] > 1){
                re.add(nums[k] + "->" + nums[i-1]);
                k = i;
                System.out.println(k);
            } else if (i == nums.length-1 && nums[i] - nums[i-1] > 1){
                re.add(String.valueOf(nums[i]));
            } else if (i == nums.length-1 && nums[i] - nums[i-1] < 1) {
                re.add(nums[k] + "->" + nums[i-1]);
            }
        }


        return re;
    }
}
