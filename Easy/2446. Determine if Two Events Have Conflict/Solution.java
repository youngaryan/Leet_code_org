public class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int[] ev1;
        int[] ev2 ;
        ev1 = parser(event1);
        ev2 = parser(event2);


        if (ev1[0] <= ev2[0]){if (ev1[1] >= ev2[0])return true;}
        if (ev1[0] > ev2[0]){
            return ev1[1] >= ev2[0] && ev2[1] >=ev1[0];
        }

        return false;
    }

    private int[] parser(String[] event) {
        int[] re = new int[2];
        for (int i = 0; i < event.length; i++) {
            String temp;
            temp = event[i].replace(":", "");
            re[i] = Integer.parseInt(temp);
        }
        return re;
    }

}
