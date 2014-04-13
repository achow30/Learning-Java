import java.util.Scanner;
import java.util.Random;

public class Problem31 {
	public static void main(String[] args) {
		Random randomNumber = new Random();
		Scanner keyboard = new Scanner(System.in);
		int guess;
		int number;
		int guessCount;
		String choice;
		
		do {
			guessCount = 1;
			number = randomNumber.nextInt(1000) + 1;
			System.out.print("Guess a number between 1 - 1000: ");
			guess = keyboard.nextInt();
			
			while (guess != number) {
				while (guess > number) {
					System.out.println("Too high! Try lower.");
					guessCount++;
					guess = keyboard.nextInt();
				}
				
				while (guess < number) {
					System.out.println("Too low! Try higher.");
					guessCount++;
					guess = keyboard.nextInt();
				}
				
			}
			
			if (guessCount < 10) {
				System.out.printf("You entered %d guesses.\n", guessCount);
				System.out.println("Either you know the secret, or you got lucky.");
			}
			else if (guessCount == 10) {
				System.out.printf("You entered %d guesses.\n", guessCount);
				System.out.println("Aha! You know the secret!");
			}
			else {
				System.out.printf("You entered %d guesses.\n", guessCount);
				System.out.println("You can do better than that!");
			}
			
			System.out.println("Play again?");
			choice = keyboard.next();
		}
		while (choice.equalsIgnoreCase("yes"));
	}
}