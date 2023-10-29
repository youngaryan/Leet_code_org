class Solution {
    public int dayOfYear(String date) {
        int[] monthL = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        String[] sp = date.split("-");

        int fM = sp[1].charAt(0) - '0';
        if (fM == 1) {
            fM = 10;
        }
        int sM = sp[1].charAt(1) - '0';

        int m = fM + sM;
        int d = Integer.parseInt(sp[2]);
        int r = 0;

        for (int i = 0; i < m - 1; i++) {
            r += monthL[i];
        }

        int y = Integer.parseInt(sp[0]);

        if (y == 1900) {
            r--;
        }
        if (y % 4 == 0 && m > 1) {
            if (m > 2) {
                r++;
            } else {
                if (d > 29) {
                    r++;
                }
            }
        }
        return r + d;
    }
}