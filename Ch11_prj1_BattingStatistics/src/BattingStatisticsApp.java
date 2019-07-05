import java.math.BigDecimal;
import java.util.Scanner;
import java.text.NumberFormat;
public class BattingStatisticsApp {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		int numberOfAtBats = 0;
		int bat = 0;
		int sum = 0;
		int[] atbat = {bat};
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Welcome to the Batting Average Calculator");
			System.out.println();
			System.out.print("Enter number of times at bats: ");
			bat = sc.nextInt();
			System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home\nrun");
			for (int i = 1; i <= bat; i++) {
				int j = 0;
				System.out.print("Result for at-bat " + i + ":");
				atbat[j] = sc.nextInt();
				j++;
			
				for (int attempt: atbat) {
					if (attempt > 0) { 
					++numberOfAtBats;
				} 
				}
			} 
			
			String numberOfAtBatsAsString = Integer.toString(numberOfAtBats);
			String arlen = Integer.toString(atbat.length);
			BigDecimal arrayLength = new BigDecimal (arlen);
			BigDecimal numberAtBat = new BigDecimal (numberOfAtBatsAsString);
			BigDecimal battingAverage = numberAtBat.divide(arrayLength, 3);
		
			
			for (int attempt: atbat)  {
				sum += attempt;
			}
			
			String sumAsString = Integer.toString(sum);
			BigDecimal accurateSum = new BigDecimal (sumAsString);
			BigDecimal slugging = accurateSum.divide(arrayLength, 3);
			
			NumberFormat percent = NumberFormat.getPercentInstance();
			System.out.println("Batting average: " + battingAverage);
			System.out.println("Slugging percent: " + percent.format(slugging));
			
			
	}
}
}

