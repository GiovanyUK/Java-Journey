import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5, 8));
    }
    public static double convertToCentimeters(int inches) {
        double centimeters = inches * 2.54;
        return centimeters;
    }
    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {
        //return convertToCentimeters((int) ((heightInFeet * 12.00) + remainingHeightInInches));
        double result = (heightInFeet * 12.00 + remainingHeightInInches) * 2.54;
        return result;
    }
}
