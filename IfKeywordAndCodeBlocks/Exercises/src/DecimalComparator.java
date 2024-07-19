public class DecimalComparator {
    // write code here
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        long newFirstNumber = (long) (firstNumber * 1000.00);
        long newSecondNumber = (long) (secondNumber * 1000.00);
        if (newFirstNumber == newSecondNumber) {
            return true;
        } else {
            return false;
        }
    }
}