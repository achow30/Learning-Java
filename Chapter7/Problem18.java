import java.util.Random;

public class Problem18 {	
	private static Random randomNumbers = new Random(1);
	
	private enum Status {CONTINUE, WON, LOST};
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	private static int Craps() {
		int numberOfRolls = 1;
		int myPoint = 0;
		Status gameStatus; //can contain CONTINUE, WON, or LOST
		
		int sumOfDice = rollDice();
		
		switch(sumOfDice) {
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.LOST;
			break;
		default:
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice;
			break;
		}
		
		while (gameStatus == Status.CONTINUE) 
		{
			numberOfRolls++;
			sumOfDice = rollDice();
			
			if (sumOfDice == myPoint) {
				gameStatus = Status.WON;
			}
			else if (sumOfDice == SEVEN) {
				gameStatus = Status.LOST;
			}
		}
		
		if (gameStatus == Status.WON) {
			return 100 + numberOfRolls;
		}
		
		else
			return 500 + numberOfRolls;
	}
	
	public static void main(String[] args) {
		int play;
		int[] wins = new int[21];
		int[] losses = new int[21];
		
		for (int count = 0; count < 1000000; count++) {
			play = Craps();
			
			if (play < 500) {
				switch (play) {
				case 101:
					wins[0]++;
					break;
				case 102:
					wins[1]++;
					break;
				case 103:
					wins[2]++;
					break;
				case 104: 
					wins[3]++;
					break;
				case 105:
					wins[4]++;
					break;
				case 106:
					wins[5]++;
					break;
				case 107:
					wins[6]++;
					break;
				case 108:
					wins[7]++;
					break;
				case 109:
					wins[8]++;
					break;
				case 110:
					wins[9]++;
					break;
				case 111: 
					wins[10]++;
					break;
				case 112:
					wins[11]++;
					break;
				case 113:
					wins[12]++;
					break;
				case 114:
					wins[13]++;
					break;
				case 115:
					wins[14]++;
					break;
				case 116:
					wins[15]++;
					break;
				case 117:
					wins[16]++;
					break;
				case 118: 
					wins[17]++;
					break;
				case 119:
					wins[18]++;
					break;
				case 120:
					wins[19]++;
					break;
				default:
					wins[20]++;
				}
			}
			else {
				switch (play) {
				case 501:
					losses[0]++;
					break;
				case 502:
					losses[1]++;
					break;
				case 503:
					losses[2]++;
					break;
				case 504: 
					losses[3]++;
					break;
				case 505:
					losses[4]++;
					break;
				case 506:
					losses[5]++;
					break;
				case 507:
					losses[6]++;
					break;
				case 508:
					losses[7]++;
					break;
				case 509:
					losses[8]++;
					break;
				case 510:
					losses[9]++;
					break;
				case 511: 
					losses[10]++;
					break;
				case 512:
					losses[11]++;
					break;
				case 513:
					losses[12]++;
					break;
				case 514:
					losses[13]++;
					break;
				case 515:
					losses[14]++;
					break;
				case 516:
					losses[15]++;
					break;
				case 517:
					losses[16]++;
					break;
				case 518: 
					losses[17]++;
					break;
				case 519:
					losses[18]++;
					break;
				case 520:
					losses[19]++;
					break;
				default:
					losses[20]++;
				}
			}
		}
		
		int sumOfWins = 0;
		int sumOfLosses = 0;
		
		System.out.println("Number of rolls that won: ");
		for (int i = 0; i < wins.length; i++) {
			System.out.printf("%d: %d\n", (i + 1), wins[i]);
			sumOfWins += wins[i];
		}
		
		System.out.println("Number of rolls that lost: ");
		for (int j = 0; j < losses.length; j++) {
			System.out.printf("%d: %d\n", (j + 1), losses[j]);
			sumOfLosses += losses[j];			
		}
		
		System.out.printf("Total number of wins: %d\n", sumOfWins);
		System.out.printf("Total number of losses: %d\n", sumOfLosses);
	}
	
	public static int rollDice()
	{
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		
		int sum = die1 + die2;
		
		return sum;
	}
}
