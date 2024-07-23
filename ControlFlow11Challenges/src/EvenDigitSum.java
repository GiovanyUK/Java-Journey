public class EvenDigitSum {
    // write code here
    public static int getEvenDigitSum (int number) {
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
            keepNum = number % 10;
            number = number / 10;
            if (keepNum % 2 == 0) {
                sum += keepNum;
            }

        }
        return sum;

    }
}