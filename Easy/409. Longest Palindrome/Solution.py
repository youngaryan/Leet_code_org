class Solution:
    def longestPalindrome(self, s: str) -> int:
        letters = [0] * (26 * 2)
        t = ''
        result = 0;
        hasOdd = False
        
        for char in s:
            if char.isupper():
                letters[ord(char) - ord('A') + 26] +=1
            else:
                 letters[ord(char) - ord('a')] +=1
        

        for i in letters:
            result+=i

            if i%2!=0:
                result-=1
                hasOdd = True

        return result + 1 if hasOdd else result