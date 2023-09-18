
class Solution {
    public String capitalizeTitle(String title) {

        char[] charArrya = title.toCharArray();
        int length = charArrya.length;

        // System.out.println(Arrays.toString(charArrya));

        for (int i = 0; i < length; i++) {

            int firstIndex = i;

            while (i < length && charArrya[i] != ' ') {
                charArrya[i] = Character.toLowerCase(charArrya[i]);
                i++;
            }

            if (i - firstIndex > 2) {
                charArrya[firstIndex] = (char) (charArrya[firstIndex] - 32);
            }
        }

        return String.valueOf(charArrya);
    }
}