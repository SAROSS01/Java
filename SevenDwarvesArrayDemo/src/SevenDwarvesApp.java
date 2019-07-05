
public class SevenDwarvesApp {
	public static void main (String[] args) {
		System.out.println("7 Dwarves App");
		String[] dwarves = new String[7];
		
		dwarves[0] = "Sleepy";		
		dwarves[1] = "Grumpy";
		dwarves[2] = "Doc";
		dwarves[3] = "Sneezy";
		dwarves[4] = "Bashful";
		dwarves[5] = "Dopey";
		dwarves[6] = "Happy";
		
		for (int i = 0; i < dwarves.length; i++) {
			System.out.println(i +" " + dwarves[i]);
		}
		}

}
