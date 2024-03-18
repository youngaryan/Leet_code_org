import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int ones = 0, zeros = 0, maxL = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {

                zeros++;
            } else {
                ones++;
            }
            if (!hashMap.containsKey(ones - zeros)) {
                hashMap.put((ones - zeros), j);
            }

            if (ones == zeros) {
                maxL = ones + zeros;
            } else {
                maxL = Math.max(maxL, j - hashMap.get((ones - zeros)));
            }
        }

        return maxL;
    }
}

/*
 * Input: nums = [0,1,0]
 * Output: 2
 * Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal
 * number of 0 and 1.
 */