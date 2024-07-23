public class FirstLastDigitSum {
    // write code here
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5231));
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int times = 0;
        int sum = 0;
        int keepNum = number;
        int digit = 0;

        while (keepNum != 0) {
            digit++;
            keepNum = keepNum / 10;
        }
        while (number != 0) {
            times++;
            if (digit == 1) {
                return number * 2;
            }
            keepNum = number % 10;
            number = number / 10;
            if (digit == times || times == 1) {
                sum += keepNum;
            }

        }
        return sum;
    }
}