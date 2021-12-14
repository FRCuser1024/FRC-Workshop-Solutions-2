import java.util.Scanner;

public class Workshop2Project2LeapYear {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int a = (int) (10 * Math.random()) + 1, guess = -1, numGuesses = 0;
        for (int i = 1948; i <= 2068; i++) {
            if (i == 2006) {
                System.out.println(i + " birth year");
            }
            else if (i % 4 == 0 && !(i % 100 == 0 && i % 400 != 0)) {
                System.out.println(i + " leap year");
            }
            else {
                System.out.println(i);
            }
        }
    }
}