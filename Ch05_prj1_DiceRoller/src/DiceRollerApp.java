import java.util.Scanner;

public class DiceRollerApp {
	public static void main(String [] args) {
		// display a welcome message
		System.out.println("Dice Roller"); // prints 'dice roller
		System.out.println(); // prints blank line
		
		// create the Scanner object
		Scanner sc = new Scanner (System.in); // creates scanner object sc
		
		// start the dice rolling
		String choice = getUserChoice(sc, "Roll the dice? (y/n): "); // calls getUserChoice method and a passes arguments sc and prompt to method
		
		// continue until choice isn't equal to y
		while (choice.equalsIgnoreCase("y")) {
				int die1 = rollDie(); // declare variable 1
				int die2 = rollDie(); // declare variable 2
				printDice(die1, die2); // calls print dice method and passes variables die1 and die2 
				choice = getUserChoice(sc, "Roll again? (y/n): ");  // calls getUserChoice method and passes sc and new prompt
				
		}
	}
		
		// creates getUserChoice Method
		private static String getUserChoice (Scanner sc, String prompt) { // declares parameters that get values passed to them
			System.out.print(prompt); // prints string that gets passed to it
			return sc.next(); // returns user input to choice
		}
		
		// creates rollDie method 
		private static int rollDie() { // 
			return (int)(Math.random() * 6) + 1; //returns random integer a value between 1 and 6 to the calling method
		}
		// creates printDice method 
		private static void printDice (int die1, int die2) { // declares parameters that get values passed to them
			int total = die1 + die2; // declares variable total 
			
			System.out.println();
			System.out.println("Die 1: " + die1); // prints value of die1
			System.out.println("Die 2: " + die2); // prints value of die2
			System.out.println("Total: " + total); // prints total
			printSpecialMessage(total); // calls print special message method and passe argument total to it
		}
			
			// creates method printSpecialMessage
			private static void printSpecialMessage(int total) { // Declares parameter total to method 
				switch (total) {
				case 2:
					System.out.println("Snake eyes! ");
					System.out.println();
				case 12:
					System.out.println("Boxcars!");
					System.out.println();
				default:
					System.out.println();
				}
			}
		}
		
		
		
	


