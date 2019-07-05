import java.util.Scanner;

public class TableOfPowersApp {
	static public void main (String[] args) {
		System.out.println("Welocme to squares and cubes table!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
				
	
		while (choice.equalsIgnoreCase("y")) {
			h3
		
			System.out.print("Enter an integer: ");
			int n = sc.nextInt();
			
			String table = "";
			System.out.println("Number\tSquared\tCubed");
			System.out.println("=======\t======\t======");
			for (int i = 1; i <= n; i++) {
				int s  = i * i; 
				int c = i * i * i; 
				System.out.println(i+"\t"+s+"\t"+c);
				
			}
			//System.out.println("Number\tSquared\tCubed");
			//System.out.println("=======\t======\t======");
			//for (int i = 1; i <= n; i++) {
				//int s  = i * i; 
				//int c = i * i * i; 
				//System.out.println(i+"\t"+s+"\t"+c);
				
			//}
			System.out.print("Continue: y/n? ");
			choice = sc.next();
			System.out.print(table);
			
		}
	}
		
		
		
		
		
		
		
		
		
		
	}


		
	
