class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;

        for (int i : nums) {
            if (count == 0) {
                candidate = i;
            }

            if (i == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}

/*
 * 6ms
 * public int majorityElement(int[] nums) {
 * Arrays.sort(nums);
 * 
 * return nums[nums.length/2];
 * }
 */

/*
 * 11ms
 * public int majorityElement(int[] nums) {
 * HashMap<Integer, Integer> map = new HashMap<>();
 * 
 * int length = nums.length;
 * for (int i = 0; i < length; i++) {
 * map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
 * }
 * 
 * length /= 2;
 * for (int i : map.keySet()) {
 * if (map.get(i) > length) {
 * return i;
 * }
 * }
 * return -1;
 * 
 * }
 */

/*
 * 1ms
 * public int majorityElement(int[] nums) {
 * int candidate = 0, count = 0;
 * 
 * 
 * for (int i : nums) {
 * if (count == 0) {
 * candidate = i;
 * }
 * 
 * if (i == candidate) {
 * count++;
 * }else{
 * count--;
 * }
 * }
 * return candidate;
 * }
 */