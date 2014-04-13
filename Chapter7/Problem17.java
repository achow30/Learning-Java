import java.util.Random;

public class Problem17 {
	public static void main(String[] args) {
		Random randomNumbers = new Random();
		
		int[] possibleSums = new int[11];
		int die1, die2;
		int sum;
		
		for (int roll = 0; roll < 36000000; roll++) {
			die1 = randomNumbers.nextInt(6) + 1;
			die2 = randomNumbers.nextInt(6) + 1;
			
			sum = die1 + die2;
			
			switch (sum) {
			case 2:
				possibleSums[0]++;
				break;
			case 3:
				possibleSums[1]++;
				break;
			case 4:
				possibleSums[2]++;
				break;
			case 5:
				possibleSums[3]++;
				break;
			case 6:
				possibleSums[4]++;
				break;
			case 7:
				possibleSums[5]++;
				break;
			case 8:
				possibleSums[6]++;
				break;
			case 9:
				possibleSums[7]++;
				break;
			case 10:
				possibleSums[8]++;
				break;
			case 11:
				possibleSums[9]++;
				break;
			case 12:
				possibleSums[10]++;
				break;
			default:
				possibleSums[10]++;
				break;
			}
		}
		
		for (int count = 0; count < possibleSums.length; count++) {
			System.out.printf("%d:\t%d\n", (count + 2), possibleSums[count]);
		}
	}
}
