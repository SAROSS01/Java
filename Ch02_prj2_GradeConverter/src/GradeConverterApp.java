import java.util.Scanner;

public class GradeConverterApp {
	public static void main(String[]args) {
		System.out.println("Welcome to the letter grade converter");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter numerical grade: ");
			int numGrade = sc.nextInt();
			char letterGrade = ' ';
			if (numGrade < 60) {
			 letterGrade += 'F';
			}	
			else if (numGrade < 67) {
			 letterGrade += 'D';
			}
			else if (numGrade < 79) {
			 letterGrade += 'C';
			}
			else if (numGrade < 87) {
			 letterGrade += 'B';
			}
			else if (numGrade <= 100) {
			 letterGrade += 'A';
			}
			 
			System.out.println("Letter grade: " + letterGrade);
			
			System.out.println("Continue? (y/n)  ");
			choice = sc.next();
	}
}
					
}				
					
					
			
	
	

	

