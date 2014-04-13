import java.util.Scanner;

public class Problem9 {
	private static int min(int[][] array) {
		int minimum = array[0][0];
		
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array[x].length; y++) {
				if (array[x][y] < minimum) {
					minimum = array[x][y];
				}
			}
		}
		
		return minimum;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int[][] t = new int[2][3];
		
		for (int count = 0; count < t.length; count++) {
			int row = count + 1;
			for (int j = 0; j < t[count].length; j++) {
				System.out.printf("Enter an integer for row %d: ", row);
				t[count][j] = keyboard.nextInt();
			}
			System.out.println();
		}
		
		for (int i = 1; i < 4; i++) {
			System.out.printf("%5d", i);
		}
		
		for (int row = 0; row < t.length; row++) {
			System.out.println();
			System.out.print(row + 1);
			
			for (int column = 0; column < t[row].length; column++) {
				if (column == 0) {
					System.out.printf("%4d", t[row][column]);
				} else {
					System.out.printf("%5d", t[row][column]);
				}
			}
		}
	}
}
