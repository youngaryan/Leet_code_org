import static java.util.Arrays.sort;

public class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int j = 0, k = 0;
        int[] oddIndexes = new int[nums.length/2];

        int[] evenIndexes = new int[nums.length - oddIndexes.length];

        for (int i = 0; i < nums.length; i++) {
            if (i%2 == 0){
                evenIndexes[j] = nums[i];
                j++;
            }else {
                oddIndexes[k] = nums[i];
                k++;
            }
        }

        sort(oddIndexes);
        sort(evenIndexes);

        j = 0;
        k = oddIndexes.length-1;

        for (int i = 0; i < nums.length; i++) {
            if (i%2 == 0){
                nums[i] = evenIndexes[j];
                j++;
            }else {
                nums[i] = oddIndexes[k];
                k--;
            }
        }

        return nums;
    }
}
