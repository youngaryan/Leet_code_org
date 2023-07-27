class Solution {
    public  int passThePillow(int n, int time) {
        if(time == 0) return 1;

        boolean toggle = false;
        int current = 1;

        while(time != 0){
            while(toggle == false && time !=0){
                current++;
                time--;
                if(current == n){
                    toggle = true;
                }
            }while(toggle == true && time != 0){
                current--;
                time--;
                if(current == 1){
                    toggle = false;
                }
            }
        }

        return current;
    }
}