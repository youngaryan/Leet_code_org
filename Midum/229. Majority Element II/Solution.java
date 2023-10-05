import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0, maj1 = 0, maj2 = 0;
        List<Integer> result = new ArrayList<>();

        for (int i : nums) {
            if (i == maj1) {
                count1++;
            } else if (i == maj2) {
                count2++;
            } else if (count1 == 0) {
                maj1 = i;
                count1++;
            } else if (count2 == 0) {
                maj2 = i;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i : nums) {
            if (i == maj1) {
                count1++;
            } else if (i == maj2) {
                count2++;
            }
        }

        if (count1 > nums.length / 3) {
            result.add(maj1);
        }

        if (count2 > nums.length / 3) {
            result.add(maj2);
        }
        return result;
    }
}
