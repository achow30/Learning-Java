import java.util.Scanner;

public class Problem18and19 {
	public static void squareOfAsterisks(int number) {
		for (int j = 1; j <= number; j++) {
			for (int i = 1; i <= number; i++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void squareOfAnyCharacter(int number, char fillCharacter) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				System.out.print(fillCharacter);
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number and a character, separated by a space: ");
		
		int number = keyboard.nextInt();
		char fill = keyboard.next().charAt(0);
		
		squareOfAsterisks(number);
		squareOfAnyCharacter(number, fill);
	}
}
