import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maximumNumber = 0;
        int minimumNumber = 0;
        int counter = 0;

        while (true) {
            System.out.println("Please enter a number: ");
            try {
                int number = Integer.parseInt(sc.nextLine());
                if (number > maximumNumber) {
                    maximumNumber = number;
                    counter++;
                    if (counter == 1) {
                        minimumNumber = maximumNumber;
                    }
                } else if (number < minimumNumber) {
                    minimumNumber = number;
                }
            } catch (NumberFormatException e) {
                break;
            }
        }
        if (counter == 0) {
            System.out.println("You have not entered any data");
        } else {
            System.out.println("You entered an Invalid Character so ultimately you stopped the program, final results are:\n"
                + minimumNumber
                + " is the minimum number and "
                + maximumNumber
                + " is the maximum number!");

        }
    }
}
