public class Solution {
    public int averageValue(int[] nums) {

        int sum = 0;
        int c = 0;
        for (int num : nums) {
            if (num%6 == 0){sum+=num;c++;}
        }
        if (c == 0)return 0;
        return sum/c;
    }
}
