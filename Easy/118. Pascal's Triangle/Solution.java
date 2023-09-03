import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 1)
            return Arrays.asList(Arrays.asList(1));
        if (numRows == 2) {
            result.add(Arrays.asList(1));
            result.add(Arrays.asList(1, 1));
            return result;
        }

        /*
         * i need to store the preivious row and depending on if the length is odd or
         * even genrate a half of a new row
         */

        /*
         * 1
         * 1 1
         * 1 2 1
         * 1 3 3 1
         * 
         * 
         * 
         */

        result.add(Arrays.asList(1));
        result.add(Arrays.asList(1, 1));

        for (int i = 2; i < numRows; i++) {
            List<Integer> tempInside = new ArrayList<>();
            List<Integer> prevRow = result.get(i - 1);
            tempInside.add(1);

            for (int j = 1; j < prevRow.size(); j++) {
                int sum = prevRow.get(j - 1) + prevRow.get(j);
                tempInside.add(sum);
            }

            tempInside.add(1);
            result.add(tempInside);
        }
        return result;
    }
}

// (n+1)C(r) = (n)C(r - 1) + (n)C(r)