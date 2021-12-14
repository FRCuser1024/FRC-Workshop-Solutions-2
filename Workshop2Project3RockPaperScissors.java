import java.util.Scanner;

public class Workshop2Project3RockPaperScissors {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int a = (int) (10 * Math.random()) + 1, userRecord = 0, compRecord = 0;
        while (userRecord + compRecord < 3) {
            System.out.println("Please write your move ('Rock', 'Paper', or 'Scissors') below. ");
            String userGuessRaw = in.nextLine();
            int userGuess, compGuess = (int) (3 * Math.random());
            switch (userGuessRaw) {
                case "Rock":
                    userGuess = 0;
                    break;
                case "Scissors":
                    userGuess = 1;
                    break;
                case "Paper":
                    userGuess = 2;
                    break;
                case default:
                    userGuess = -1;
            }
            if (userGuess == -1) {
                System.out.println("Please type in a valid move. The current score is " + userRecord + "-" + compRecord + ". ");
            }
            else if (userGuess == compGuess) {
                System.out.println("It's a tie! The current score is " + userRecord + "-" + compRecord + ". ");
            }
            else if ((userGuess + 1) % 3 == 1) {
                userRecord++;
                System.out.println("You won! Congratulations! The current score is " + userRecord + "-" + compRecord + ". ");
            }
            else {
                compRecord++;
                System.out.println("You lost. Don't worry, you'll get them next time! The current score is " + userRecord + "-" + compRecord + ". ");
            }
        }
        if (userRecord > compRecord) {
            System.out.println("You won the game! Congratulations! You won " + userRecord + "-" + compRecord + ". ");
        }
        else {
            System.out.println("You lost " + userRecord + "-" + compRecord + ". It's okay, you'll beat them next game. ");
        }
    }
}