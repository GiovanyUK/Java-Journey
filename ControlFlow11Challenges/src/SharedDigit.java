public class SharedDigit {
    // write code here
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        int firstDigitNum1 = num1 / 10;
        int secondDigitNum1 = num1 % 10;

        int firstDigitNum2 = num2 / 10;
        int secondDigitNum2 = num2 % 10;

        return firstDigitNum1 == firstDigitNum2
                ||
                firstDigitNum1 == secondDigitNum2
                ||
                secondDigitNum1 == firstDigitNum2
                ||
                secondDigitNum1 == secondDigitNum2;
    }
}
