import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.Arrays.sort;

public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();
        sort(arr);

        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i - 1] - arr[i]);
            if (diff < minDiff) {
                minDiff = diff;
                result.clear();
            }
            if (diff == minDiff) {
                result.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return result;
    }
}
