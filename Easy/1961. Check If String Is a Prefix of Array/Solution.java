class Solution {
    public boolean isPrefixString(String s, String[] words) {
        if(s.length() < words[0].length()){ return false;}
        StringBuilder stringBuilder = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            stringBuilder.append(words[i]);
            if(stringBuilder.toString().equals(s)) return true;
        }
        return false;
    }
}