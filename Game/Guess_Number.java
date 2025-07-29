/*Create a class game, which will allow the user to guess a number between 1 and 100.Game should have following Functions:
 * 1. Constructor to generate the random number.
 * 2. UserInput() to take user input.
 * 3. isCorrect() to check if the user's guess is correct.
*/

import java.util.Random;
import java.util.Scanner;

class Game{
    private int NumtoGuess;
    private int attempts;

    public Game(){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        NumtoGuess = random.nextInt(100) + 1; 
        attempts = 0;
        int userGuess = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I am thinking of a number between 1 and 100. Try to guess it!");

        while (userGuess != NumtoGuess) {
            System.out.println("Enter your guess:");
            userGuess = sc.nextInt();
            attempts++;

            if (userGuess < NumtoGuess) {
                System.out.println("Too Low.. Try Again!!");
            }
            else if (userGuess > NumtoGuess) {
                System.out.println("Too High.. Try Again!!");
            }
            else{
                System.out.println("Congratulations You Guess Correct Number in " + attempts + " Attempts.");
            }
        }
        sc.close();
    }
}

public class Guess_Number {
    public static void main(String[] args) {
        Game g1 = new Game();
    }
}
