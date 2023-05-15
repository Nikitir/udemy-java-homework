package Udemy;

public class Method1 {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Viktor", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Krist", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Laura", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Leila", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Valdemar", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " manage to get into position " + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
            return 4;
        }
    }
