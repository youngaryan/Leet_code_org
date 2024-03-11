import java.util.Arrays;

class Solution {
    public int candy(int[] ratings) {
        int result = 0, length = ratings.length, i = 1, j = length - 2;

        int[] leftIteration = new int[length];
        Arrays.fill(leftIteration, 1);

        int[] rightIteration = new int[length];
        Arrays.fill(rightIteration, 1);

        while (j != -1 && i < length) {
            if (ratings[i] > ratings[i - 1]) {
                leftIteration[i] = leftIteration[i - 1] + 1;
            }

            if (ratings[j] > ratings[j + 1]) {
                rightIteration[j] = rightIteration[j + 1] + 1;
            }
            i++;
            j--;
        }

        // System.out.println(Arrays.toString(ratings));
        // System.out.println(Arrays.toString(leftIteration));
        // System.out.println(Arrays.toString(rightIteration));

        for (int k = 0; k < length; k++) {
            result += Math.max(leftIteration[k], rightIteration[k]);
        }
        return result;
    }
}
/*
 * 
 * Input: ratings = [1,2,3]
 * Input: ratings = [1,0,2]
 * Output: 5
 * Explanation: You can allocate to the first, second and third child with 2, 1,
 * 2 candies respectively.
 * 
 * Example 2:
 * 
 * Input: ratings = [1,2,2]
 * Output: 4
 * Explanation: You can allocate to the first, second and third child with 1, 2,
 * 1 candies respectively.
 * The third child gets 1 candy because it satisfies the above two conditions.
 */