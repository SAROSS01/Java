import java.util.Scanner;

public class DiceRollerApp {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		System.out.println("Welcome to the Dice Roller App\n");
		String roll = Console.getChoiceString(sc, "Roll the dice?", "y", "n");
		while (choice.equalsIgnoreCase("y")) {
			if(roll.equalsIgnoreCase("y")) {
				Dice d = new Dice();
				d.roll();
				d.printRoll();
				
				choice = Console.getChoiceString(sc, "Roll again?", "y", "n");
			} else {
				System.out.println("Goodbye");
				choice = "n";
			}
			
		}
		
	
	}
}
