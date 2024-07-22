public class Main {
    public static void main(String[] args) {
        int iCounter = 0;
        int realNumber = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                iCounter = iCounter + 1;
                realNumber = realNumber + i;
                System.out.println("The number with the valid value is " + i);
            }
            if (iCounter == 5) {
                break;

            }
        }
        System.out.println("The sum of the forementioned numbers is: " + realNumber);
    }

}

