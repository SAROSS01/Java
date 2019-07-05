
public class Dice {
	private Die die1;
	private Die die2;
	
	public Dice() {
		 die1 = new Die();
		 die2 = new Die();
	}

	public int getDie1Value() {
		return die1.getValue();
	}
	
	public int getDie2Value() {
		return die2.getValue();
	}
	
	public int getSum() {
		return die1.getValue() + die2.getValue();
		
	}
	
	public void roll() {
		die1.roll();
		die2.roll();
	}
	
	public void printRoll() {
		int total = getSum();
		System.out.println("Die 1: " + getDie1Value());
		System.out.println("Die 2: " + getDie2Value());
		System.out.println("Total: " + getSum());
		
		switch (total) {
		case 2:
			System.out.println("Snake eyse!");
			break;
			
		case 7:
			System.out.println("Craps!");
			break;
		case 12:
			System.out.println("Boxcars!");
			break;
		}
	}
}
