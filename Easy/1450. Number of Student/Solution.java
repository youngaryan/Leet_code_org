public class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;
        int count = 0;

        while (startTime.length > count){
            if (startTime[count] <= queryTime && endTime[count] >= queryTime)
                result++;
            count++;
        }
        return result;
    }
}
