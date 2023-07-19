import java.util.*;

public class Solution
{
    public List<List<Integer>> threeSum(int[] nums)
    {
        if (nums.length <3)return new ArrayList<>();

        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i>0 && nums[i] == nums[i-1]){
                continue;
            }

            int target = -nums[i];
            int left = i+1;
            int right = nums.length-1;

            while (left<right){
                int sum = nums[left]+nums[right];

                if (sum == target){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left<right && nums[left] == nums[left-1]){
                        left++;
                    }while (left<right && nums[right] == nums[right+1]){
                        right--;
                    }
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}
