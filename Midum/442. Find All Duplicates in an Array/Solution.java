import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] hashTable = new int[nums.length + 1];
        List<Integer> res = new ArrayList<>();

        int temp;

        for (int j = 0; j < nums.length; j++) {
            temp = nums[j];

            if (hashTable[temp] == -1) {
                res.add(temp);
            } else {
                hashTable[temp] = -1;
            }
        }

        return res;

    }
}