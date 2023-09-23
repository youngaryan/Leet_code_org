// import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] hold = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0, length = hold.length;

        while (i < nums1.length && j < nums2.length && k <= length / 2 + 1) {
            if (nums1[i] < nums2[j]) {
                hold[k] = nums1[i];
                i++;
            } else {
                hold[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < nums1.length && k <= length / 2 + 1) {
            hold[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length && k <= length / 2) {
            hold[k] = nums2[j];
            j++;
            k++;
        }

        // System.out.println(Arrays.toString(hold));
        // System.out.println(k);

        return length % 2 == 0 ? (double) (hold[length / 2] + hold[length / 2 - 1]) / 2
                : hold[length / 2];
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