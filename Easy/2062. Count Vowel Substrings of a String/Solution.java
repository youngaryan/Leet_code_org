import java.util.HashSet;

class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0, len = word.length();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < len - 4; i++) {
            set.clear();

            for (int j = i; j < len; j++) {
                if (word.charAt(j) == 'a' || (word.charAt(j)) == 'e' || (word.charAt(j)) == 'i'
                        || (word.charAt(j) == 'o' || (word.charAt(j) == 'u'))) {
                    set.add(word.charAt(j));

                    if (set.size() == 5) {
                        count++;
                    }
                } else {
                    break;
                }
            }
        }
        return count;
    }

}
