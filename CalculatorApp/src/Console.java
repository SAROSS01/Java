import java.util.Scanner;

public class Console {
    public static Double getDouble(Scanner sc, String prompt) {
        Double i = 0.0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                i = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    
}
   
   


