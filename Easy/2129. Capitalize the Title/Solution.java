class Solution {
    public String capitalizeTitle(String title) {

        String[] broken = title.split(" ");

        StringBuilder result = new StringBuilder();

        for (String string : broken) {
            string = string.toLowerCase();

            if (string.length() > 2) {
                result.append(string.substring(0, 1).toUpperCase() + string.substring(1) + " ");
            } else {
                result.append(string + " ");

            }

        }

        return result.toString().trim();
    }
}