
public class GuessGameGame {
	//Guessgamegame has 3 instance variables for the player object
	Player p1;
	Player p2;
	Player p3; 
	
	public void startGame(){
		// creates 3 player objects and assigns them to 3 player instance variables
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		// Declare 3 variables to hold 3 guesses the players make
		int guessP1 = 0;
		int guessP2 = 0;
		int guessP3 = 0;
		
		// Declare 3 variables to hold a true or false based on the players answer
		boolean p1IsRight = false;
		boolean p2IsRight = false;
		boolean p3IsRight = false;
		
		// Make a target number the players have to guess
		int targetNumber = (int) (Math.random() * 10);
		
		while (true) {
			System.out.println("The number to guess is: " + targetNumber);
			// Calls each players guess method from the player class
			p1.guess();
			p2.guess();
			p3.guess();
		
			// gets access to player guess by accessing the number variable in the player class
			guessP1 = p1.number;
			System.out.println("Player 1 guessed..." + guessP1);
			guessP2 = p2.number;
			System.out.println("Player 2 guessed..." + guessP2);
			guessP3 = p3.number;
			System.out.println("Player 3 guessed..." + guessP3);
			
			// Compares each player guess to the target number, any number matches sets
			// that players variable to true
			if (guessP1 == targetNumber) {
				p1IsRight = true;
			}
			
			if (guessP2 == targetNumber) {
				p2IsRight = true;
			}
			
			if (guessP3 == targetNumber) {
				p3IsRight = true;
			}
			
			if (p1IsRight || p2IsRight || p3IsRight) {
				System.out.println("We have a winner!");
				System.out.println("Player 1 got it right?" + p1IsRight);
				System.out.println("Player 2 got it right?" + p2IsRight);
				System.out.println("Player 3 got it right?" + p3IsRight);
				System.out.println("Game over.");
				break;
			}
			
			else {
				System.out.println("Players will have to try again.");
				
			}
		}
	}

}
