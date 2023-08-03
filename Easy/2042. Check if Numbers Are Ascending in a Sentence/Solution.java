class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr = s.split(" ");
        int perNum = -1, num;
        

        for (String string : arr) {
            if(Character.isDigit(string.charAt(0))){
                num = Integer.valueOf(string);
                if(num <= perNum)return false;
                perNum = num;
            }
        }
        return true;
    }
}