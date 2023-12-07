import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        ArrayList<ArrayList<Integer>> integers = new ArrayList<>();
        ArrayList<Integer> temp;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.get(i).size(); j++) {
                if (integers.size() <= i + j) {
                    temp = new ArrayList<>();
                    temp.add(nums.get(i).get(j));
                    integers.add(i + j, temp);
                } else {
                    integers.get(j + i).add(nums.get(i).get(j));

                }
            }
        }

        int[] result = new int[nums.size() * nums.get(0).size()];
        int pointer = 0;

        for (int i = 0; i < integers.size(); i++) {
            for (int j = 0; j < integers.get(i).size(); j++) {

                    result[pointer] = integers.get(i).get(j);
                    pointer++;
            }
        }
        return result;
    }
}