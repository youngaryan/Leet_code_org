class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE, i = 0, j = height.length - 1, maxArea = 0;

        while (i != j) {
            maxArea = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(max, maxArea);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return max;
    }
}