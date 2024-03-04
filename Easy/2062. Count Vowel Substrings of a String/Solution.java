class Solution {
    public int countVowelSubstrings(String word) {
        // HashSet<Character> characters = new HashSet<>();

        // characters.add('a');
        // characters.add('e');
        // characters.add('u');
        // characters.add('i');
        // characters.add('o');
        int left = 0, right = 4, count = 0;
        word+='2';

        while (left < right && right <= word.length()) {

            while (left < right && !(isVowel(word.charAt(left)))) {
                left++;
                continue;
            }

            while (left + 4 > right) {
                right++;
                continue;
            }

            // System.out.println("left : " + left + ", right :" + right);
            // System.out.println(word.substring(left, right));
            // System.out.println(includeAllVowels(word, left, right));
            // System.out.println("------------------");
            if (includeAllVowels(word, left, right)) {
                count++;
                right++;
                continue;
            }
            right++;
            if (right == word.length() && left + 4 != word.length()) {
                left++;
                right = left + 4;
            }
        }
        return count;
    }

    private boolean includeAllVowels(String w, int left, int right) {
        boolean[] vowel = new boolean[5];
        for (int i = left; i <= right; i++) {
            if (w.charAt(i) == 'a') {
                vowel[0] = true;
                continue;
            }
            if (w.charAt(i) == 'e') {
                vowel[1] = true;
                continue;
            }
            if (w.charAt(i) == 'i') {
                vowel[2] = true;
                continue;
            }
            if (w.charAt(i) == 'o') {
                vowel[3] = true;
                continue;
            }
            if (w.charAt(i) == 'u') {
                vowel[4] = true;
                continue;
            }

            return false;

        }

        for (boolean c : vowel) {
            if (c == false) {
                return false;
            }
        }
        return true;
    }

    private boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'u' || c == 'i' || c == 'o') {
            return true;
        }

        return false;
    }
}
