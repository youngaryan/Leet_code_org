import java.util.Arrays;

class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length, count = 1, right = length-1, left =length-2;

        while(left >= 0){
            if(arr[right] == arr[left]){
                count++;
            }else{
                if(count == arr[right])return count;
                count = 1;
                right = left;
            }
            left--;
        }
        if(count == arr[right])return count;
        return -1;
    }
}