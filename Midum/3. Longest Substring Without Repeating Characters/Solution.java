import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        int length = s.length() , left = 0, max = 0;
        char tempRight;


        for (int right = left; right < length; right++) {
            tempRight = s.charAt(right);
            while(hashSet.contains(tempRight)){
                hashSet.remove(s.charAt(left));
                left++;
            }
            hashSet.add(tempRight);
            
            if(hashSet.size() > max) max = hashSet.size();
        }

        return max;
    }
}