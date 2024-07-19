public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3599 * 60 + 59)); // it overflows if I add 1 more second
        System.out.println(getDurationString(3600, 0));
    }

    public static String getDurationString(int seconds) {

        int minutes = (seconds / 60) % 60;
        int hours = seconds / 3600 % 60;
        int newSeconds = (seconds % 60);

        if (seconds >= 0) {
            return (hours + " h " + minutes + " m " + newSeconds + " s ");
        } else {
            return ("Negative numbers = invalid");
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        int result = minutes * 60 + seconds;
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            return getDurationString(result);
        } else {
            if (seconds >= 59) {
                return ("Seconds over 59 become minutes, please type seconds on a range of 0-59");
            }
                else return ("Invalid negative numbers"); }
        }
    }
