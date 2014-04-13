import java.util.Scanner;

public class Problem6 {
	public static double sphereVolume(double radius) {
		double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		return volume;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the radius of your sphere in meters: ");
		double sphereRadius = keyboard.nextDouble();
		
		double volume = sphereVolume(sphereRadius);
		
		System.out.printf("The volume of your sphere is %f meters cubed.\n", volume);
	}

}
