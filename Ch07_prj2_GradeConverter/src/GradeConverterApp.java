import java.util.Scanner;

public class GradeConverterApp {
	static public void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Welcome to the Letter grade converter!");
			
			int x = Console.getIntWithinRange(sc, "Enter numerical grade: ", 0, 100);
			Grade grade1 = new Grade(x);
			System.out.println("Letter Grade: " + grade1.getLetter());
			choice = Console.getChoiceString(sc, "Continue? (y/n)", "y", "n");
		}
		
	}

}
