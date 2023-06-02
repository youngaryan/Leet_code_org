import java.util.*;
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> re = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    re.add(nums1[i]);
                    nums1[i] = -1;
                    nums2[j] = -2;
                }
            }
        }


        int [] result = new int[re.size()];
        for (int i = 0; i < re.size(); i++)
            result[i] = re.get(i);

        return result;
    }
}
