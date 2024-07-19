public class MinutesToYearsDaysCalculator {
    // write code here
    public static void printYearsAndDays(long minutes) {
        long hours = minutes / 60;
        long days = (hours / 24) % 365;
        long years = (hours / 24) / 365;

        if (minutes < 0) {
            System.out.print("Invalid Value");
        } else {
            System.out.print(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}