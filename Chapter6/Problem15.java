import java.util.Scanner;

public class Problem15 {
	public static double hypotenuse(double side1, double side2) {
		double side3 = Math.sqrt((side1*side1) + (side2*side2));
		
		return side3;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter two sides of a right triangle, separated by a space: ");
		double side1 = keyboard.nextDouble();
		double side2 = keyboard.nextDouble();
		
		System.out.printf("The hypotenuse of this right triangle is %.2f.\n", hypotenuse(side1, side2));
	}

}
