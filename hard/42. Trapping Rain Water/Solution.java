class Solution {
    public int trap(int[] height) {
        if (height.length == 2 || height.length == 1)
            return 0;

        int maxWater = 0, maxLeft, maxRight;

        for (int i = 0; i < height.length; i++) {
            maxLeft = 0;
            maxRight = 0;
            for (int j = 0; j <= i; j++) {
                if (height[j] > maxLeft) {
                    maxLeft = height[j];
                }
            }

            for (int j = i + 1; j < height.length; j++) {
                if (height[j] > maxRight) {
                    maxRight = height[j];
                }
            }

            maxWater = Math.max(maxWater, (maxWater + Math.min(maxRight, maxLeft) - height[i]));
        }

        return maxWater;
    }
}
