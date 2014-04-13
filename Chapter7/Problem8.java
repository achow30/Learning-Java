import java.util.Random;

public class Problem8 {
	public static void main(String[] args) {
		Random randomNumber = new Random();
		double[] w = new double[99];
		
		double max = 0;
		double min = 1000;
		
		for (int i = 0; i < w.length; i++) {
			w[i] = randomNumber.nextDouble();
			
			if (w[i] < min) {
				min = w[i];
			}
		}
		
		System.out.println(min);
		
		for (int j = 0; j < w.length; j++) {
			if (w[j] > max) {
				max = w[j];
			}
		}
		
		System.out.println(max);
	} 
}
