import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid(10));
    }
    public static String isValid(int number) {
        Scanner scanner = new Scanner(System.in);
        int valid = 0;
        int sum = 0;
        int times = 0;
        boolean validNum = false;
        boolean isNumber = true;
        while (times < 5){
            times ++;
            do {
                System.out.println("Enter number #" + number);
                try {
                    valid = checkData(""+ scanner.nextInt());
                    validNum= valid != number ? false : true;
                    if (validNum) {
                        isNumber = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Please Input an integer");
                    isNumber = false;
                    validNum = false;
                    scanner.nextLine();
                }
                if (valid != number && isNumber == true) {
                    System.out.println("Invalid Number");
                }
            } while (!validNum);
            sum += number;
            number++;
        }
        return "The sum of these numbers is: " + sum;
    }
    public static int checkData(String number) {

        int dob = Integer.parseInt(number);
        int minimumNumber = 1;

        if (dob < minimumNumber) {
            return -1;
        }

        return (dob);
    }
}
