package quizpack;

//Imports the Scanner to the class
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[]args) {
		
		// Creates a Scanner to use in the program
		Scanner input = new Scanner(System.in);
		// Asks the user to enter the number of completions
		System.out.print("Please input the number of completions: ");
		double Completions = input.nextDouble();
		// Asks the user to enter the number of passes attempted
		System.out.print("Please input the number of passes attempted: ");
		double Attempted = input.nextDouble();
		// Asks the user to enter the total number of yards
		System.out.print("Please input the total number of yards: ");
		double Yards = input.nextDouble();
		// Asks the user for the total amount of touch downs
		System.out.print("Please input the total number of touch downs: ");
		double TouchDowns = input.nextDouble();
		// Asks the user to enter the total amount of touch downs
		System.out.print("Please input the total number of interceptions: ");
		double Interceptions = input.nextDouble();

		// Calculate x,y,z, and w
		double x = ((Completions / Attempted) - .3) * 5;
		double y = ((Yards / Attempted) - 3) * .25;
		double z = (TouchDowns / Attempted) * 20;
		double w = 2.375 - ((Interceptions / Attempted) * 25);


		// Make sure all neg components restricted to 0.
		x = (x < 0) ? 0 : x;
		y = (y < 0) ? 0 : y;
		z = (z < 0) ? 0 : z;
		w = (w < 0) ? 0 : w;
		
		// Make sure all the components are capped at 2.375
		x = (x > 2.375) ? 2.375 : x;
		y = (y > 2.375) ? 2.375 : y;
		z = (z > 2.375) ? 2.375 : z;
		w = (w > 2.375) ? 2.375 : w;

		// Calculate the Quarterback's Rating
		double QuarterBackrt = ((x + y + z + w) / 6) * 100;

		// Display the Quarterback Rating to the first decimal place
		System.out.printf("The rating of this quarterback is %3.1f", QuarterBackrt);
	}

}


