class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toLowerCase()))return true;
        if(word.equals(word.toUpperCase()))return true;

        String firsString = word.substring(0,1);
        String rest = word.substring(1);

        if(firsString.toUpperCase().equals(firsString) && rest.equals(rest.toLowerCase()))return true;

        return false;
    }
}