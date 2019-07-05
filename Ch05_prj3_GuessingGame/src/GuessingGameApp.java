import java.util.Scanner;
import java.lang.Math;
public class GuessingGameApp {
	public static void main(String[]args) {
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		Scanner sc = new Scanner (System.in);
		String choice = "y";
		
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("I'm thinking of a number between 1 to 100.\nTry to guess it.");
			int number = getIntWithinRange(sc, "Enter number: ", 1, 100);
			getGuessPrint(sc,number);
			System.out.println("Try again? (y/n)");
			choice = sc.nextLine();
		}
		
	}
	public static int getIntWithinRange(Scanner sc, String prompt, int x, int y) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) { 
			i = getInt(sc, prompt);
			if (i < x) {
				System.out.println("Error! Number must be greater than or equal to " + x +".");
			}	else if (i > y) {
				System.out.println("Error! Number must be less than or equal to " + y + ".");
			}	else {
					isValid = true;
			}
		} return i;
	}
	public static int getInt(Scanner sc, String prompt) { 
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.println(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else { 
				System.out.println("Error! Invalid number. Try again.");
			}
			sc.nextLine();
		}
		return i;
}
	public static int getRandom() {
		return (int)(Math.random() * 100) + 1;
	}
	public static void getGuessPrint(Scanner sc,int number) {
		int guess = getRandom();
		int numberOfGuesses = 0;
		boolean isValid = false;
		
		while (!isValid) {
		if ((guess + 10) <= number) {
			System.out.println("Way too high! Guess again");
			numberOfGuesses ++;
			number = getIntWithinRange(sc, "Enter number: ", 1, 100);
			
		}	else if ((guess - 10) >= number) {
			System.out.println("Way too low! Guess again");
			numberOfGuesses ++;
			number =getIntWithinRange(sc, "Enter number: ", 1, 100);
		}	else if (guess > number) {
			System.out.println("Too low! Guess again");
			numberOfGuesses ++;
			number = getIntWithinRange(sc, "Enter number: ", 1, 100);
		}	else if (guess < number) {
			System.out.println("Too high! Guess again");
			numberOfGuesses ++;
			number = getIntWithinRange(sc, "Enter number: ", 1, 100);	
		}	else { 
				System.out.println("You got it in " + numberOfGuesses + " tries.");
				if (numberOfGuesses <= 3) {
					System.out.println("Great Work! You are a mathematical wizard.");
				} else if (numberOfGuesses > 3 && numberOfGuesses <=7) {
					System.out.println("Not too bad! You've got some potential.");
				}	else {
						System.out.println("What took you so long? Maybe you should take some lessons");
					}
					isValid = true;
					
					
				}
			}
		}
	
	}

	