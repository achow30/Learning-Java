import java.util.Scanner;

public class SquareOfAsterisks {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int side, columns = 0, rows = 0, space = 0;
		
		System.out.print("Input a size of the side of a square, from 1 to 20: ");
		side = keyboard.nextInt();
		
		while (columns < side){
			System.out.print("* ");
			columns++;
		}
		
		System.out.print("\n");
		columns = 0;
		
		while (rows < (side-2)){
			System.out.print("*");			
			
			while (space < (side-2)){
				System.out.print("  ");
				space++;
			}
			
			System.out.print(" *\n");
			space = 0;
			rows++;
		}
		
		while (columns < side){
			System.out.print("* ");
			columns++;
		}

		keyboard.close();
	}

}
