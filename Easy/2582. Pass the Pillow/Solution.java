class Solution {
    public  int passThePillow(int n, int time) {
        if(time == 0) return 1;

        int current = 1;

        while (time != 0 ){
            current++;
            time--;
            if(current == n){
                current = otherway(current, time);
            
            }
        }
        return current;
    }

    private int otherway(int current, int time) {
        while( current != 1){
            current --;
            time--;
            if(time == 0) break;
        }
        return current;
    }
}