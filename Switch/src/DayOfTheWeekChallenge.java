public class DayOfTheWeekChallenge {
    public static void main(String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);

    }

    public static void printDayOfTheWeek(int day) {
        String dayOfTheWeek = " " + day;
        String dayOfWeek = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 0 -> "Sunday";
            default -> {
                String badResponse = "Invalid day";
                yield badResponse;
            }

        };
        System.out.println(dayOfWeek + " stands for " + dayOfTheWeek);
    }

    public static void printWeekDay(int day) {
        String dayOfWeek = "Invalid day";
        if (day == 0) {
            dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        }else if (day == 3) {
            dayOfWeek = "Wednesday";
        }else if (day == 4) {
            dayOfWeek = "Thursday";
        }else if (day == 5) {
            dayOfWeek = "Friday";
        }else if (day == 6) {
            dayOfWeek = "Saturday";
        }
        System.out.println(dayOfWeek + " stands for " + day);
    }
}