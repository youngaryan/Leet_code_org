class Solution {
    public int findSpecialInteger(int[] arr) {
        
        if (arr.length < 3) {
            return arr[0];
        }

        int len = arr.length, count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count = 0;
            }
            count++;
            if (count > len / 4) {
                return arr[i];
            }
        }
        return -1;
    }
}