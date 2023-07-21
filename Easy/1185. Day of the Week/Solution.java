import java.util.Calendar;
import java.util.GregorianCalendar;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        Calendar calendar = new GregorianCalendar(year, month, day);

        calendar.add(Calendar.DAY_OF_MONTH, -7);
        return calendar.getTime().toString();
        
    }
}