import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (check(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean check(int num) {
        int temp, org = num;

        while (num > 1) {
            temp = num % 10;
            if (temp == 0) {
                return false;
            }
            if (org % (temp) != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}