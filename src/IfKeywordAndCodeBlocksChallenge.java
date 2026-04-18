public class IfKeywordAndCodeBlocksChallenge {
    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//        calculateScore(gameOver, score, levelCompleted, bonus);
//
//        calculateScore(true, 800, 5, 100);
//
//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        int newFinalScore = newScore;
//
//        if (newGameOver){
//            newFinalScore += (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + newFinalScore);
//        }

//
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//
//        if (gameOver){
//            finalScore += (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
//        calculateScore(true, 10000, 8,200);
//        calculateScore(gameOver, score, levelCompleted,bonus);

        int highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your highScore is " + highScore);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
        return finalScore;
    }
}
