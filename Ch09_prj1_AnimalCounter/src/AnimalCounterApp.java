
public class AnimalCounterApp {

	public static void main(String[] args) {
		Alligator alli = new Alligator();
		count(alli, 3);

		Sheep baa = new Sheep("Blackie");
		count(baa, 2);

		try {
			Sheep baa2 = (Sheep) baa.clone();
			baa2.setName("Dolly");
			count(baa2, 3);

		} catch (CloneNotSupportedException ex) {
			System.out.println(ex);

		}
		count(baa, 1);

	}

	public static void count(Countable c, int maxCount) {
		if (c instanceof Sheep) {
			System.out.println("Counting Sheep...\n\n");
		} else {
			System.out.println("Counting Alligators...\n\n");

		}
		for (int i = 1; i <= maxCount; i++) {
			c.incrementCount();
			System.out.println(c.getCountString());
		}

		c.resetCount();
		System.out.println("\n\n");

	}
}
