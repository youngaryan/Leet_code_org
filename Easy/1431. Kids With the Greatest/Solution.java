import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int[] sortedCandies = Arrays.copyOf(candies, candies.length);
        sortedCandies = sort(sortedCandies);

        for (int candy : candies) {
            if (candy + extraCandies >= sortedCandies[0]) {
                result.add(true);
            } else {
                result.add(false);

            }
        }
        return result;
    }

    private int[] sort(int[] candies) {
        if (candies.length<2)return candies;

        int length = candies.length;
        int[] left = new int[length/2];
        int[] right = new int[length - length/2];

        System.arraycopy(candies, 0, left, 0, length / 2);

        if (length - length / 2 >= 0)
            System.arraycopy(candies, length / 2, right, 0, length - length / 2);

        sort(left);
        sort(right);

        return merge(candies,left,right);
    }

    private int[] merge(int[] candies, int[] left, int[] right) {
        int i=0, j=0, k=0;

        while (left.length>i && right.length> j){
            if(left[i]>=right[j]){
                candies[k] = left[i];
                i++;
            }else {
                candies[k] = right[j];
                j++;
            }
            k++;
        }

        while (left.length>i){
            candies[k] = left[i];
            i++;
            k++;
        }
        while (right.length> j){
            candies[k] = right[j];
            j++;
            k++;
        }
        return candies;
    }
}
