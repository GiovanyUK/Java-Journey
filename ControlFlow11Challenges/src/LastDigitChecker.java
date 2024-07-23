public class LastDigitChecker {
    // write code here
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) == false || isValid(num2) == false || isValid(num3) == false) {
            return false;
        }

        int lastDigitNum1 = num1 % 10;
        int lastDigitNum2 = num2 % 10;
        int lastDigitNum3 = num3 % 10;

        if (lastDigitNum1 == lastDigitNum2 || lastDigitNum1 == lastDigitNum3 || lastDigitNum2 == lastDigitNum3) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int num) {
        if (num < 10 || num > 1000) {
            return false;
        } else {
            return true;
        }
    }
}