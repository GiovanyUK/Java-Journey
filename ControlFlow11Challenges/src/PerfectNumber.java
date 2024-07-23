public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }
        int pNum = 0;
        for (int j = 1 ; j < number ; j++) {
            if (number % j == 0) {
                pNum += j;
                if (pNum == number) {
                    return true;
                }
            }
        } return false;
    }
}
