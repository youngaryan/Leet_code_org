import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> result = new ArrayList<>();

        result.add(Arrays.asList(1));
        result.add(Arrays.asList(1, 1));

        if (rowIndex == 0) {
            return result.get(0);
        }

        if (rowIndex == 1) {
            return result.get(1);
        }

        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> tempInside = new ArrayList<>();
            List<Integer> perRow = result.get(i - 1);
            tempInside.add(1);

            for (int j = 1; j < perRow.size(); j++) {
                int sum = 0;

                sum += perRow.get(j - 1) + perRow.get(j);
                tempInside.add(sum);
            }

            tempInside.add(1);
            result.add(tempInside);
        }
        return result.get(rowIndex);
    }
}