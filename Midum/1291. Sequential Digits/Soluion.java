import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int[] sqIntegers = new int[] {
                123456789, 23456789, 3456789, 456789, 56789, 6789, 789, 89
        };

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < sqIntegers.length; i++) {
            while (sqIntegers[i] > 0) {
                if (sqIntegers[i] >= low && sqIntegers[i] <= high) {
                    result.add(sqIntegers[i]);
                }
                sqIntegers[i] /= 10;
            }
        }

        Collections.sort(result);
        return result;
    }
}