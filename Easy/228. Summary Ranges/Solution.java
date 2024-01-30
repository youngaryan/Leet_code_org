import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        } else if (nums.length == 1) {
            return new ArrayList<>(Arrays.asList(String.valueOf(nums[0])));
        }

        List<String> result = new ArrayList<>();
        int left = 0, right = 1;

        while (right < nums.length) {

            if (nums[right] - 1 == nums[right - 1]) {
                right++;
            } else {
                if (left == right - 1) {
                    result.add(String.valueOf(nums[left]));
                    left = right;
                    right += 1;

                } else {
                    result.add(nums[left] + "->" + nums[right - 1]);
                    left = right;
                    right += 1;
                }
            }
        }

        if (left == right - 1) {
            result.add(String.valueOf(nums[left]));
        } else {
            result.add(nums[left] + "->" + nums[right - 1]);
        }
        return result;
    }
}
