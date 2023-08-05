class Solution {
    public int countSegments(String s) {
        if(s.length() == 0) return 0;
        int cout = 0;

        String[] re = s.split(" ");

        for (int i = 0; i < re.length; i++) {
            re[i] = re[i].trim();
            if(re[i].length() !=0){cout++;}
        }
        
        return cout;
    }
}