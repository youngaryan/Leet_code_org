public class doubleChar {

    public String doubleeChar(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }

}
