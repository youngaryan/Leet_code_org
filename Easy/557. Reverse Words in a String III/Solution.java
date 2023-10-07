class Solution {
    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        String[] sp = s.split(" ");

        for (int i = 0; i < sp.length; i++) {
            reverse.setLength(0);
            int l = sp[i].length() - 1;

            while (l != -1) {
                reverse.append(sp[i].charAt(l));
                l--;
            }

            stringBuilder.append(reverse + " ");
        }

        return stringBuilder.toString().trim();
    }
}
