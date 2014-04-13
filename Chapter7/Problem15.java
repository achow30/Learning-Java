
public class Problem15 {
	public static void main(String[] args) {
		int ARRAY_LENGTH;
		
		if (args.length == 0) {
			ARRAY_LENGTH = 10;
		}
		else {
			ARRAY_LENGTH = Integer.parseInt(args[0]);
		}
		int[] array = new int[ARRAY_LENGTH];
		
		System.out.printf("%s%8s\n", "Index", "Value");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = 2 + 2 * i;
			System.out.printf("%5d%8d\n", i, array[i]);
		}
	}

}
