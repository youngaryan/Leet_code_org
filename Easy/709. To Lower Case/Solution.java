class Solution {
    public String toLowerCase(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                c = (char)(c+32);
            }

            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}