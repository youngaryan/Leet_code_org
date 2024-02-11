import java.util.ArrayList;

class Solution {
    public int numSquares(int n) {
        int minSqr = (int) Math.floor(Math.sqrt(n)), sum = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i <= minSqr; i++) {

            arrayList.add((int) Math.pow(i, 2));
        }

        System.out.println(arrayList);

        return sum;
    }
}