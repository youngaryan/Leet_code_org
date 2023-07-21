class Solution {
    public int findComplement(int num) {

        String bString = Integer.toBinaryString(num);
        int result = 0;

        for ( int i = bString.length()-1; i >= 0; i--) {
            if(bString.charAt(i) == '0'){result+= (int)Math.pow(2, bString.length()-i-1);}
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.findComplement(5));
    }
}