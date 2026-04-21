package basics;
public class JavaMethodChallenge {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        // Challenge:
        // First method should be named displayHighScorePosition
        // which will have two parameters, one is player's name and one for player's
        // position in a high score list. it should print a message like "Tim managed to
        // get into position 2 on the high score list".
        // Second method should be named as calculateHighScorePosition, which will have only 1
        // parameter, the player's score.
        // this method should return a number between 1 and 4, based on the score values shown below:
        // score                         result
        // score >= 1000                   1
        // score >= 500 and < 100          2
        // score >=100 and < 500           3
        // all other scores                4

        // Finally, after calling both methods and display the results for the following scores:
        // 1500, 1000, 500, 100 and 25.

        int highestScore = 1500, secondHighestScore = 1000, thirdHighestScore = 500, secondLowestScore = 100, lowestScore = 25;
        displayHighScorePosition("Sam", calculateHighScorePosition(highestScore));
        displayHighScorePosition("James", calculateHighScorePosition(secondHighestScore));
        displayHighScorePosition("Robert", calculateHighScorePosition(thirdHighestScore));
        displayHighScorePosition("Anne", calculateHighScorePosition(secondLowestScore));
        displayHighScorePosition("Polly", calculateHighScorePosition(lowestScore));
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score list");
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
