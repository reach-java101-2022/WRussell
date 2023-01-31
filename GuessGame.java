package murach.games;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String args[]) {
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println();
        System.out.print("Enter an upper limit: ");
        int upperLimit;
        Scanner dc = new Scanner(System.in);
        upperLimit = dc.nextInt();
        Random random = new Random();
        int number = random.nextInt(upperLimit - 1) + 1;
		// TODO: Replace next line with code that prompts user for upper limit.
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
       
        Scanner pc = new Scanner(System.in);
        System.out.print("Enter a guess: ");
        
        int guess = pc.nextInt();
        
        // Generate a random number between 0 and the upperLimit variable
        
        
        if (guess > number) {
        	System.out.println("Your guess is too high");
        } else if (guess < number ) {
        	System.out.println("Your guess is too low");
        } else {
        	System.out.println("You got it right!");
        }
        System.out.print("Guess again? (y/n)");
        choice = sc.nextLine();
        System.out.println();
       
    }
        sc.close();
        System.out.println("Bye!");
}
}