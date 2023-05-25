import java.util.HashSet;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length <=1)return false;
        //if (k >= nums.length)return false;
        HashSet<Integer> hashSet = new HashSet<>();
        int j = -1;
        int result ;
        for (int i = 0; i < nums.length; i++) {
            if (!hashSet.contains(nums[i]))
                hashSet.add(nums[i]);
            else {
                j = i;
                break;
            }
        }
        if (j<0)return false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[j]) {
                result = Math.abs(i - j);
                if (result <= k && result != 0)
                    return true;
            }
        }
        return false;
    }
}
