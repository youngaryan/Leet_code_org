import java.util.ArrayList;

class Solution {
    public int maxSum(int[] nums) {

        int[][] index = new int[10][101];
        int j, max = -1;

        for (int i = 0; i < nums.length; i++) {
            j = 0;
            while (index[maxDigitFinder(nums[i])][j] != 0) {
                j++;
            }
            index[maxDigitFinder(nums[i])][j] = nums[i];
        }

        ArrayList<Integer> hold;

        for (int i = 9; i >= 0; i--) {
            j = 0;
            hold = new ArrayList<>();

            if (index[i][j] == 0) {
                continue;
            } else {
                while (index[i][j] != 0) {
                    hold.add(index[i][j]);
                    j++;
                }
                max = Math.max(max, maxSumPer(hold));
            }
        }
        return max;
    }

    private int maxSumPer(ArrayList<Integer> hold) {
        if (hold.size() < 2) {
            return -1;
        }

        int m1 = 0, m2 = -1, temp, h;

        for (int i = 0; i < hold.size(); i++) {
            h = hold.get(i);
            if (h > m2) {
                if (h > m1) {
                    temp = m1;
                    m1 = h;
                    m2 = temp;
                } else {
                    m2 = h;
                }
            }
        }
        return m2 + m1;
    }

    private int maxDigitFinder(int n) {
        int max = -1, temp;

        while (n > 0) {
            temp = n % 10;
            if (temp > max) {
                max = temp;
            }
            n /= 10;
        }

        return max;
    }
}