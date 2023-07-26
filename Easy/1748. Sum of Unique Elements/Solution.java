import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 */
public class Solution {

       public int sumOfUnique(int[] nums) {
        int result = 0;

        Map<Integer,Integer> hasMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(hasMap.containsKey(nums[i])){
                hasMap.put(nums[i], -1);
            }else{
                hasMap.put(nums[i], 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (hasMap.get(nums[i]) == 1) {
                result += nums[i];
            }
        }

        return result;
    }
}