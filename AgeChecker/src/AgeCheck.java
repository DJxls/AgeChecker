import java.util.Scanner;

/** documentation 
 * Write a program to determine if a person is mature or minor
 * 
 * @author darren
 *
 */


/* uses the scanner class to get age as input from the user and uses loop 
to determine if user is a minor or adult. */

public class AgeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean exit = false; // exit loop if user input is empty 
		
		// do while loop
		do {
			System.out.println("Enter your age.");
			Scanner scanner = new Scanner(System.in); // initialize scanner class
			String input = scanner.nextLine();     // Assign scanner to variable
			
			if(input.isEmpty())
			{
				exit = true;  // exit loop
			}
			else
			{
				int age = Integer.parseInt(input);
				System.out.println(age > 17 ? "You are an adult.":"You are a minor.");
			}
			if(exit)
			{
				scanner.close();  // close the scanner 
			}
		}while(!exit);   // ! is not equal to 

	}

}
