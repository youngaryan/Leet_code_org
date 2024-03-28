import java.util.HashMap;

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        // if (nums.length == 1) {
        // return 1;
        // }
        int maxFre = -1, temp, leftWnid = 0, res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i : nums) {
        // temp = map.getOrDefault(i, 0) + 1;
        // map.put(i, temp);

        // maxFre = Math.max(temp, maxFre);
        // System.out.println(maxFre);

        // }

        for (int rightWind = 0; rightWind < nums.length; rightWind++) {
            temp = map.getOrDefault(nums[rightWind], 0) + 1;
            map.put(nums[rightWind], temp);
            maxFre = Math.max(temp, maxFre);

            while (maxFre > k) {
                // res = rightWind - leftWnid;

                map.put(nums[leftWnid], map.get(nums[leftWnid]) - 1);

                if (map.get(nums[leftWnid]) == maxFre - 1) {
                    maxFre--;

                }
                leftWnid++;

                // maxFre = map.get(nums[rightWind]);

            }
            res = Math.max(res, rightWind - leftWnid + 1);

        }
        return res;
        // return leftWnid == 0 ? nums.length : (maxFre <= k ? nums.length - leftWnid :
        // res);
        // return (maxFre <= k ? nums.length - leftWnid : res);
    }
}

/*
 * Input: nums = [1,2,3,1,2,3,1,2], k = 2
 * Output: 6
 * Explanation: The longest possible good subarray is [1,2,3,1,2,3] since the
 * values 1, 2, and 3 occur at most twice in this subarray. Note that the
 * subarrays [2,3,1,2,3,1] and [3,1,2,3,1,2] are also good.
 * It can be shown that there are no good subarrays with length more than 6.
 */