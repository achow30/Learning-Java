
public class Problem11 {
	public static void main(String[] args) {
		int[] counts = new int[10];
		
		for (int i = 0; i < counts.length; i++) {
			counts[i] = 0;
		}
		
		int[] bonus = new int[15];
		
		for (int i = 0; i < bonus.length; i++) {
			bonus[i] += 1;
		}
		
		int[] bestScores = new int[5];
		
		for (int i = 0; i < bestScores.length; i++) {
			System.out.println(bestScores[i]);
		}
	}
}
