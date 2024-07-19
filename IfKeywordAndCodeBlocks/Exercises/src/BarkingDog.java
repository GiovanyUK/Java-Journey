public class BarkingDog {
    // write code here
    public static boolean shouldWakeUp(boolean isBarking, int hoursOfDay) {
        if (isBarking == true) {
            if (hoursOfDay >= 24 || hoursOfDay < 0)   {
                return false;
            }
            else return hoursOfDay > 22 || hoursOfDay < 8;
        }

        else if(isBarking == false) {
            return false;
        }
        return isBarking;
    }
}
