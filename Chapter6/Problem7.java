
public class Problem7 {
	public static void main(String[] args) {
		double x = 7.5;
		double y = 0.0;
		double z = -6.5;
		
		System.out.println("Math.abs(7.5) = " + Math.abs(x));
		System.out.println("Math.floor(7.5) = " + Math.floor(x));
		
		System.out.println("Math.abs(0.0) = " + Math.abs(y));
		System.out.println("Math.ceil(0.0) = " + Math.ceil(y));
		
		System.out.println("Math.abs(-6.5) = " + Math.abs(z));
		System.out.println("Math.ceil(-6.5) = " + Math.ceil(z));
		
		System.out.println("Math.ceil(-Math.abs(-8 + Math.floor(-5.5))) = " + Math.ceil(-Math.abs(-8 + Math.floor(-5.5))));
	}

}
