import java.util.Scanner;

public class problem16 {
	public static boolean isMultiple(int x, int y) {
		boolean multiple = (y%x == 0);
		
		return multiple;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number1;
		int number2;
		
		System.out.println("You are going to input two integers, and I am going to determine\n"
				+ "if the second input is a multiple of the first. ");
		
		System.out.println("Enter the \"end of file indicator\" if you want to quit.");
		System.out.println("For windows, it is <ctrl> z.");
		
		System.out.print("\nEnter the two integers separated by a space: ");
				
		while (keyboard.hasNext()) {
			number1 = keyboard.nextInt();
			number2 = keyboard.nextInt();
			
			if (isMultiple(number1, number2)) {
				System.out.printf("%d IS a multiple of %d.\n", number2, number1);
			}
			else {
				System.out.printf("%d is NOT a multiple of %d.\n", number2, number1);
			}
			
			System.out.println("Enter the \"end of file indicator\" if you want to quit.");
			System.out.println("For windows, it is <ctrl> z.");
			
			System.out.print("\nEnter the two integers separated by a space: ");
		}
		
		System.out.println("\nThanks for playing! Goodbye!");
				
	}

}
