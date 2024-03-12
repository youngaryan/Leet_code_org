// import java.util.Arrays;

class Solution {
    public String customSortString(String order, String s) {
        int orderLen = order.length(), limit = orderLen;
        int[] orderPri = new int[26];

        for (int i = 0; i < orderLen; i++) {
            orderPri[order.charAt(i) - 'a'] = limit;
            limit--;
        }

        int[] sArray = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i) - 'a']++;
        }

        // System.out.println(Arrays.toString(orderPri));
        // System.out.println(Arrays.toString(sArray));
        StringBuilder stringBuilder = new StringBuilder();

        int max = -1, pos = 0;
        while (max != 0) {
            max = 0;
            for (int i = 0; i < 26; i++) {
                // max = Math.max(max, orderPri[i]);
                if (max < orderPri[i]) {
                    max = orderPri[i];
                    pos = i;
                }
            }
            orderPri[pos] = -1;

            while (sArray[pos] != 0) {
                stringBuilder.append((char) ('a' + pos));
                sArray[pos]--;
            }
        }

        for (int i = 0; i < 26; i++) {
            while (sArray[i] > 0) {
                stringBuilder.append((char) ('a' + i));
                sArray[i]--;
            }
        }

        // System.out.println(Arrays.toString(orderPri));
        // System.out.println(Arrays.toString(sArray));

        return stringBuilder.toString();
    }
}