import java.util.Arrays;

class Solution {
    public int maxArea(int[] height) {
        int hor1 = 0, hor2 = 0, max = Integer.MIN_VALUE, length = height.length;
        int[] ver = Arrays.copyOf(height, length);
        Arrays.sort(ver);

        // first find the maxVer
        // then find the second, third max and soforth
        // and compare how mauch water they contain

        for (int i = 0; i < length; i++) {
            if (ver[length - 1] == height[i]) {
                hor1 = i;
                break;
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (ver[j] == height[i]) {
                    hor2 = i;
                    max = Math.max(max, Math.abs(hor1 - hor2) * ver[j]);
                }
            }
        }

        max = Math.max(max, (length - 1) * ver[0]);

        return max;
    }
}

// [1,2,4,3]