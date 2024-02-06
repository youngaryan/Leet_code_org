import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[][] mat = new int[strs.length][26];

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                mat[i][strs[i].charAt(j) - 'a']++;
            }
        }

        List<List<String>> result = new ArrayList<>();
        ArrayList<String> temp;
        Set<Integer> included = new HashSet<>();
        boolean check;

        for (int i = 0; i < mat.length; i++) {
            if (included.contains(i)) {
                continue;
            }

            temp = new ArrayList<>();
            temp.add(strs[i]);
            included.add(i);

            for (int j = i + 1; j < mat.length; j++) {
                check = true;
                for (int j2 = 0; j2 < 26; j2++) {
                    // find all anagram for each
                    if (mat[i][j2] != mat[j][j2]) {
                        check = false;
                        break;
                    }

                }
                if (check) {
                    temp.add(strs[j]);
                    included.add(j);
                }

            }
            result.add(temp);

        }
        // System.out.println(Arrays.toString(mat[0]));
        // System.out.println(Arrays.toString(mat[1]));

        // System.out.println(Arrays.deepToString(mat));
        // System.out.println(mat.length);
        // System.out.println(result);
        return result;
    }
}