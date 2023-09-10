class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int temp;

        for (int i = 0; i < nums1.length; i++) {
            temp = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    for (int k = j; k < nums2.length; k++) {
                        if (nums2[k] > nums2[j]) {
                            temp = nums2[k];
                            break;
                        }
                    }
                }
            }
            result[i] = temp;
        }

        return result;
    }
}