import java.util.ArrayList;

class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {
            if (checkSym(i)) {
                count++;
                // System.out.println(i);
            }

        }
        return count;
    }

    private boolean checkSym(int num) {
        int temp, leftSum = 0, rightSum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (num != 0) {
            temp = num % 10;
            list.add(temp);
            num /= 10;
        }

        if (list.size() % 2 != 0) {
            return false;
        }
        int i = 0, j = list.size() - 1;

        // System.out.println(list);
        while (i < j) {
            leftSum += list.get(i);
            rightSum += list.get(j);
            i++;
            j--;
        }
        return leftSum == rightSum;
    }
}