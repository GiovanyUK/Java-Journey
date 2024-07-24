import java.util.Scanner;

public class InputCalculator {
    // write code here
    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        double sum = 0;
        double average = 0;
        while (true) {
            counter++;
            try {
                double number = Double.parseDouble(sc.nextLine());
                if (number > 0 && number < 1) {
                    counter--;
                    number = 0;
                }
                sum += number;
            } catch (NumberFormatException e) {
                counter--;
                average = sum / counter;
                break;
            }

        }
        System.out.println("SUM = " + (int) sum + " AVG = " + Math.round(average));
        sc.close();
    }
}