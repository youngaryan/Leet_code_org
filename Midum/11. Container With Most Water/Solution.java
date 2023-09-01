class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE, length = height.length, min;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                min = Math.min(height[j], height[i]);
                max = Math.max(max, min * (i - j));
            }
        }

        return max;
    }
}