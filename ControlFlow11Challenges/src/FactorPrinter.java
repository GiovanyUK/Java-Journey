public class FactorPrinter {
    // write code here
    public static void printFactors (int number) {
        if (number < 1) {
            System.out.print("Invalid Value");
        }
        int newNum = 0;
        while (newNum < number) {
            newNum ++;
            if (number % newNum == 0) {
                System.out.print (" " + newNum);
            }
        }
    }
}