import java.util.Scanner;

public class Workshop2Project1GuessTheNumber {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int a = (int) (10 * Math.random()) + 1, guess = -1, numGuesses = 0;
        while (guess != a) {
            System.out.println("Please guess a number between 1 and 10. ");
            guess = Integer.parseInt(in.nextLine());
            numGuesses++;
            if (guess <= 0 || guess > 10) {
                System.out.println("Please input a guess in the valid range. ");
            }
            else {
                System.out.println("Sorry, that wasn't correct. Try again! ");
            }
        }
        System.out.println("Congratulations, that was my number! ");
        System.out.println("You used " + numGuesses + " guesses to guess my number. ");
        

        //System.out.println(string1);
    }
}