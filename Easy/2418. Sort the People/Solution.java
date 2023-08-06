import java.util.Arrays;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        String[] res = new String[names.length];
        int[] indexOfNames = new int[10000];
        
        for(int i = 0; i < heights.length; i++){
            indexOfNames[heights[i]] = i;
        }
            
        Arrays.sort(heights);
        
        for(int i = 0; i < heights.length; i++){
            res[heights.length - i - 1] = names[indexOfNames[heights[i]]];        
        }

        return res;    
    }
}