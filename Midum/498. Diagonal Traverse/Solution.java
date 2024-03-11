import java.util.ArrayList;

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        ArrayList<ArrayList<Integer>> integers = new ArrayList<>();
        ArrayList<Integer> temp;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (integers.size() <= i + j) {
                    temp = new ArrayList<>();
                    temp.add(mat[i][j]);
                    integers.add(i + j, temp);
                } else {
                    integers.get(j + i).add(mat[i][j]);

                }
            }
        }

        int[] result = new int[mat.length * mat[0].length];
        int pointer = 0;

        for (int i = 0; i < integers.size(); i++) {
            for (int j = 0; j < integers.get(i).size(); j++) {
                if (i % 2 == 0) {
                    result[pointer] = integers.get(i).get(integers.get(i).size() - j - 1);
                    pointer++;
                } else {
                    result[pointer] = integers.get(i).get(j);
                    pointer++;
                }
            }
        }
        return result;
    }
}