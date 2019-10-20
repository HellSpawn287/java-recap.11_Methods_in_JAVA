public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore;

// Użyliśmy zmiennych podanych w main'ie.
        highScore = calculate(gameOver, score, levelCompleted, bonus);
        System.out.println("#Metchod call -->> Your final score was " + highScore);

// Podaliśmy wartości w argumencie metody
        highScore = calculate(true, 800, 5, 100);
        System.out.println("#Metchod call -->> Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculate(gameOver, score, levelCompleted, bonus);
        System.out.println("#Metchod call -->> Your final score was " + highScore);

        highScore = calculate(true, 10000, 8, 200);
        System.out.println("#Metchod call -->> Your final score was " + highScore);

// sprawdzamy czy dla wartości false metoda przekaże wartość -1 do zmiennej highScore
        highScore = calculate(false, 10000, 8, 200);
        System.out.println("#Metchod call -->> Your final score was " + highScore);

        System.out.println("\n --<<Exercise>>-- \n");
        displayHighScorePosition("Paweł", 1500);
        displayHighScorePosition("Piotr", 900);
        displayHighScorePosition("Jerzy", 400);
        displayHighScorePosition("Wiesław", 50);
        displayHighScorePosition("Bug1000", 1000);
        displayHighScorePosition("Bug500", 500);
        displayHighScorePosition("Bug100", 100);

        System.out.println("\n");

        highScore = calculate(true, 10000, 8, 200);
        displayHighScorePosition("RObert", highScore);

    }

    public static int calculate(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playersName, int highScore) {
        int position = calculateHighScorePosition(highScore);
        System.out.println(playersName + "\t managed to get into position numer: \t"
                + position
                + " on the high score table");
    }

    public static int calculateHighScorePosition(int finaleScore) {

       /* if (finaleScore >= 1000) {
            return 1;
        } else if (500 <= finaleScore) {
            return 2;
        } else if (finaleScore >= 100) {
            return 3;
        }
        return 4;*/

//       Ten kod jest czytelniejszy
        int position = 4;
        if (finaleScore >= 1000) {
            position = 1;
        } else if (finaleScore >= 500) {
            position = 2;
        } else if (finaleScore >= 100) {
            position = 3;
        }

        return position;
    }

}
