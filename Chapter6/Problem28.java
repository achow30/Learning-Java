
public class Problem28 {
	private static int qualityPoints(int grade) {
		int value;
		
		switch(grade/10) {
			case 10:
			case 9:
				value = 4;
				break;
			case 8:
				value = 3;
				break;
			case 7:
				value = 2;
				break;
			case 6:
				value = 1;
			default:
				value = 0;
		}
		
		return value;
	}
}
