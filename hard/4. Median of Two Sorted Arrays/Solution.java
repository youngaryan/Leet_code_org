import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] hold = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            hold[i] = nums1[i];
        }

        for (int i = nums1.length; i < hold.length; i++) {
            hold[i] = nums2[i - nums1.length];
        }

        Arrays.sort(hold);

        return hold.length % 2 == 0 ? (double) (hold[hold.length / 2] + hold[hold.length / 2 - 1]) / 2
                : hold[hold.length / 2];
    }
}

/*
 * Example 1:
 * 
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * 
 * Example 2:
 * 
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * 
 */