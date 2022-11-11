package tryingagain;

import java.util.Scanner; 

public class Testulator {
	public static void main(String[] args) {
		Calculator count = new Calculator();
		
		Scanner myScanner = new Scanner(System.in); 
		
		System.out.println("\tPlease enter a number");
		
		int a = myScanner.nextInt();
		
		System.out.println("Please enter a second number");
		
		int b = myScanner.nextInt();
		
		int product = a * b;
		String output = a + " multiplied by " + b + " is " + product;
		
		System.out.println(output);
	}
}
