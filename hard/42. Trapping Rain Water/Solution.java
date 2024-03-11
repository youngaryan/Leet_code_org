class Solution {
    public int trap(int[] height) {
        if (height.length == 2 || height.length == 1)
            return 0;

        int maxWater = 0, maxLeft = 0, maxRight = 0, leftPointer = 0, rightPointer = height.length - 1, curentWater = 0;

        while (leftPointer < rightPointer) {
            if (height[leftPointer] < height[rightPointer]) {
                if (height[leftPointer] > maxLeft) {
                    maxLeft = height[leftPointer];
                }
                curentWater = maxLeft - height[leftPointer];
                leftPointer++;
            } else {
                if (height[rightPointer] > maxRight) {
                    maxRight = height[rightPointer];
                }
                curentWater = maxRight - height[rightPointer];
                rightPointer--;
            }

            if (curentWater > 0) {
                maxWater += curentWater;
            }
        }

        return maxWater;
    }
}
