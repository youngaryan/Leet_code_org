import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> degree = new HashMap<>();
        Map<Integer, Integer> firstIndex = new HashMap<>();
        Map<Integer, Integer> lastIndex = new HashMap<>();
        int n, maxDegree = -1, minLength = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            n = nums[i];
            degree.put(n, degree.containsKey(n) ? degree.get(n) + 1 : 1);
            firstIndex.putIfAbsent(n, i);
            maxDegree = Math.max(maxDegree, degree.get(n));
            lastIndex.put(n, i);
        }

        for (int num : degree.keySet()) {
            if (degree.get(num) == maxDegree) {
                minLength = Math.min(minLength, lastIndex.get(num) - firstIndex.get(num) + 1);
            }
        }
        return minLength;
    }
}