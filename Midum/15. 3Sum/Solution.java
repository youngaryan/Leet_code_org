import java.util.*;

public class Solution
{
    public List<List<Integer>> threeSum(int[] nums)
    {
        if (nums.length <3)return new ArrayList<>();

        Set<List<Integer>> setRes = new HashSet<>();

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = 1; j < nums.length-1; j++) {
                for (int k = 2; k < nums.length; k++) {
                    List<Integer> integers = new ArrayList<>();
                    if (nums[i]+nums[j]+nums[k] == 0  && i!=j && i!=k && j!=k){
                        integers.add(nums[i] );
                        integers.add(nums[j] );
                        integers.add(nums[k] );
                        Collections.sort(integers);
                        setRes.add(integers);
                    }
                }
            }
        }

        return setRes.stream().toList();
    }
}
