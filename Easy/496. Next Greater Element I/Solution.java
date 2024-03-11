import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        Stack<Integer> stack = new Stack<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            int temp = nums2[i];

            while (!stack.isEmpty() && stack.peek() <= temp) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                map.put(temp, stack.peek());
            }

            stack.push(temp);
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        return result;
    }
}