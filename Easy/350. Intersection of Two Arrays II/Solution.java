import java.util.ArrayList;

import static java.util.Arrays.sort;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> re = new ArrayList<>();
        int j=0, k=0;
        sort(nums1);
        sort(nums2);

        while (j<nums1.length &&k<nums2.length){
            if (nums1[j] < nums2[k])
                j++;
            else if (nums1[j] > nums2[k]) {
                k++;
            }
            else {
                re.add(nums1[j]);
                j++;
                k++;
            }
        }

        int [] result = new int[re.size()];
        for (int i = 0; i < re.size(); i++)
            result[i] = re.get(i);

        return result;
    }
}
