class Solution {
    public int trap(int[] height) {
        if (height.length == 2 || height.length == 1)
            return 0;

        int leftH = 0, rightH = height.length - 1, maxL = 0, maxR = 0, intL = 0, intR = height.length - 1, maxWater = 0;

        while (leftH < rightH) {
            if (height[leftH] > maxL) {
                maxL = height[leftH];
                intL = leftH;
            }
            if (height[rightH] > maxR) {
                maxR = height[rightH];
                intR = rightH;
            }
            rightH--;
            leftH++;
        }

        maxWater = Math.min(maxR, maxL) * (intR - intL - 1);

        // System.out.println(maxWater);
        maxWater += Math.min(height[0], maxL) * (intL);

        maxWater += Math.min(height[height.length - 1], maxL) * (height.length - 2 - intR);
        // System.out.println(maxWater);

        // System.out.println("hL and intr " + height.length + " " + intR);
        // 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }))

        for (int i = intL + 1; i < intR; i++) {
            maxWater -= height[i];
        }

        for (int i = 0; i < intL; i++) {
            maxWater -= height[i];
        }

        for (int i = intR + 1; i < height.length - 3; i++) {
            maxWater -= height[i];
        }

        return maxWater;
    }
}
