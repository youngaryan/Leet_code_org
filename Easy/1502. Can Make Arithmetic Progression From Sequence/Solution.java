import static java.util.Arrays.sort;
public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        sort(arr);
        int diff = arr[0] - arr[1];

        for (int i = 2; i < arr.length-1; i++) {
            if (arr[i] - arr[i+1] != diff)return false;
        }
        return true;
    }
}
