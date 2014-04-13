
public class Problem16 {
	public static void main(String[] args) {
		double total = 0;
		
		for (String value : args) {
			total += Double.parseDouble(value);
		}
		
		System.out.println(total);
	}
}
