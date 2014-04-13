
public class Problem32 {
	private static double distance(double aX, double aY, double bX, double bY) {
		double changeInX = Math.abs(aX - bX);
		double changeInY = Math.abs(aY - bY);
		
		double distance = Math.sqrt((changeInY * changeInY) + (changeInX * changeInX));
		
		return distance;
	}
}
