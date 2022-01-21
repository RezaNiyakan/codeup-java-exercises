import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

/**Game picks a random number between 1 and 100.
        Prompts user to guess the number.
        All user inputs are validated.
        If user's guess is less than the number, it outputs "HIGHER".
        If user's guess is more than the number, it outputs "LOWER".
        If a user guesses the number, the game should declare "GOOD GUESS!"*/

public class HighLow {
    public static void main(String[] args) {
        Random ran = new Random();
        int guessMe = ran.nextInt(100);
        int numberOfGuesses = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (win == false) {

            System.out.println("Guess a number between 1 and 100!");
            guess = input.nextInt();
            numberOfGuesses++;

            if (guess == guessMe) {
                win = true;
            } else if (guess < guessMe) {
                System.out.println("HIGHER");
            } else if (guess > guessMe) {
                System.out.println("LOWER");
            }
        }
        System.out.println("GOOD GUESS!");
        System.out.println("The number was " + guessMe + "!");
        System.out.println("It took you " + numberOfGuesses + " guesses!");
    }
}
