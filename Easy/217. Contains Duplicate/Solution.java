import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i-1] == nums[i])
//                return true;
//        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            if (!hashSet.contains(num))
                hashSet.add(num);
            else
                return true;
        }
        return false;
    }
}
