import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countWords(String[] words1, String[] words2) {
        Set<String> usedOnceA = new HashSet<>();
        Set<String> usedMoreThanOnce = new HashSet<>();
        Set<String> usedOnceAandB = new HashSet<>();

        for (String w : words1) {
            if (usedOnceA.contains(w)) {
                usedOnceA.remove(w);
                usedMoreThanOnce.add(w);
            }
            if (!usedMoreThanOnce.contains(w)) {
                usedOnceA.add(w);
            }
        }
        for (String w : words2) {
            if (usedOnceA.contains(w)) {
                if (usedOnceAandB.contains(w)) {
                    usedOnceAandB.remove(w);
                    usedMoreThanOnce.add(w);
                }
                if (!usedMoreThanOnce.contains(w)) {
                    usedOnceAandB.add(w);
                }
            }
        }
        return usedOnceAandB.size();
    }
}