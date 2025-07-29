import java.util.Random;
import java.util.Scanner;

public class Rock_Paper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Rock, 2 for Paper, 3 for Scissors:");
        int userInput = sc.nextInt();

        Random random = new Random();
        int comp_Input = random.nextInt(3);

        if (userInput == comp_Input) {
            System.out.println("Draw! Both chose the same.");
        }
        else if (userInput == 1 && comp_Input == 2 || userInput == 2 && comp_Input == 1 || userInput == 3 && comp_Input == 1) {
            System.out.println("You Win...");
        }
        else{
            System.out.println("You Lose...");
        }
        System.out.println("Your choice: " + userInput);
        System.out.println("Computer's choice: " + (comp_Input + 1));
        sc.close();
    }
}