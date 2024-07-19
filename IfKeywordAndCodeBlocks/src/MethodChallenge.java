public class MethodChallenge {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Donnie", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Biden", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Musk", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Erin", highScorePosition);

    }

    public static void displayHighScorePosition(String player_name, int player_position) {

        System.out.println(player_name + " managed to get into position "
                + player_position + " on the high score list.");
    }

    public static int calculateHighScorePosition(int player_score) {
        if (player_score >= 1000) {
            return 1;
        } else if (player_score >= 500 && player_score < 1000) {
            return 2;
        } else if (player_score >= 100 && player_score < 500) {
            return 3;
        } else return 4;

    }
}

