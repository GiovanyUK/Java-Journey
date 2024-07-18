import java.security.KeyStore;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Giova");

        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It's not a Trump supporter");
            System.out.println("And I am scared non Trump supporters lol");
        }

        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }
        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myResultDouble = (myFirstDouble + mySecondDouble) * 100.00d;
        double myOperation = myResultDouble % 40.00d;
        boolean isZero = (myOperation == 0) ? true : false;
        System.out.println(myResultDouble);
        System.out.println(myOperation);
        System.out.println(isZero);
        if (!isZero) {
            System.out.println("got some remainder");
        }

    }
}
