import java.util.Scanner;

public class Problem17 {
	public static boolean isEven(int x) {
		boolean even = (x%2 == 0);
		
		return even;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a sequence of integers, and I will determine whether each is even or not"
				+ "(to end the sequence, type <ctrl> z): ");
		while (keyboard.hasNext()) {
			int number = keyboard.nextInt();
			
			if (isEven(number)) {
				System.out.printf("%d IS even ", number);
			}
			else {
				System.out.printf("%d is NOT even ", number);
			}
		}
	}

}
