import java.util.Scanner;

public class Problem12 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int[] input = new int[5];
		int userNumber;
		int repeat;
		
		for (int i = 0; i < 5; i++) {
			repeat = 0;
			System.out.println("Enter a number: ");
			userNumber = keyboard.nextInt();
			
			for (int j = 0; j < i; j++) {
				if (input[j] == userNumber) {
					repeat++;
				}
			}
			
			if (repeat == 0) { 
				input[i] = userNumber;
			}
			
			
			System.out.println("The integers input so far (nonrepeating): ");
			
			for (int x = 0; x <= i; x++) {
				if (input[x] != 0) {
					System.out.print(input[x] + " ");
				}
			}
				
			System.out.println();
		}
		
		
	}
}
