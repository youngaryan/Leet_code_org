
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {

        if (month < 3) {
            month += 12;
            year--;
        }

        int K = year % 100;
        int J = year / 100;

        int h = (day + (13 * (month + 1)) / 5 + K + K / 4 + J / 4 - 2 * J) % 7;
        if (h < 0) {
            h += 7;

        }

        // Map the result to the corresponding day of the week
        String[] daysOfWeek = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
        return daysOfWeek[h];

    }
}