import java.text.DecimalFormat;

class Solution {
    public static double[] convertTemperature(double celsius) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00000");
        
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;

        String k = decimalFormat.format(kelvin);
        String f = decimalFormat.format(fahrenheit);

        double fK = Double.parseDouble(k);
        double fF = Double.parseDouble(f);

        return new double[]{fK, fF};
    }
}