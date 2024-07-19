public class PlayingCat {
    // write code here
    public static boolean isCatPlaying(boolean summer, int temperature) {
        
        //return temperature >= 25 && temperature <= (summer ? 45 : 35);

        if (summer == true && temperature >= 25 && temperature <= 45)
            return true;
        else if (summer == false && temperature >= 25 && temperature <= 35)
            return true;
        else return false;
    }
}