import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<List<Integer>> integers = new ArrayList<>();
        int temp;
        List<Integer> t;

        for (int i = 0; i < nums.size(); i++) {
            t = new ArrayList<>();
            for (int j = 0; j < nums.size(); j++) {
                temp = nums.get(i).get(j);
                try {
                    t = integers.get(i + j);
                    t.add(temp);

                } catch (Exception e) {
                    t.add(temp);
                    integers.add(i + j, t);
                    integers.add(t);
                }
            }
        }
        // [1,4,2,7,5,3,8,6,9]
        System.out.println((integers));
        System.out.println("------------------------------------------");
        System.out.println(nums);
        return null;
    }
}