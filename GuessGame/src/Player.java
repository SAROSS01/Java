
public class Player {
	int number = 0; // where the number goes 
		
		// creates method for randomizing integer
		public void  guess() {
			number = (int) (Math.random()*10); // result is integer >= 0 and < 10
			System.out.println("I'm guessing " + number);
		}

}
