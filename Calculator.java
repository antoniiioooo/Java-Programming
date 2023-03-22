// Were are going to try to build a calculator java program to practicing our skills and were going to try to complete this in two weeks so the dead line is June 6, 2022.


package Calculator;

import java.util.Scanner;

public class Calculator {
	
	

	public static void main(String[] args) {
		
		showMenu(); //this is going to print out a menu for the calculator
		
		
		Scanner sc = new Scanner(System.in); 

		
		System.out.println(sc.nextLine());
		
		System.out.println("pick one: ");
		double c = sc.nextDouble();
	
		
	
		System.out.println("Enter your first number of your choice!");
			double a =sc.nextDouble();
		System.out.println("Enter your second number of your choice!");	
			double b = sc.nextDouble();
			
		if(c == 1) {
			double add = (a + b); 
			System.out.println(a + " plus " + b + " equals to " + add);
		}
		if (c == 2 ) {
			double add = a + b; 
			System.out.println(a + " plus " + b + " equals to " + add);
			
		}
		if (c == 3) {
			double add = a - b;
			System.out.println(a + " minus " + b + " equals to " + add);
		}
		if (c == 4) {
			double add = a - b; 
			System.out.println(a + " minus " + b + " equals to " + add);
			
		}
		if (c == 5) {
			double add = a * b; 
			System.out.println(a + " times " + b + " equals to "+ add);
		}
		
		

	}


	private static void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("Calculator Menu");
		System.out.println("----------------");
		System.out.println("1. Add two Integers ");
		System.out.println("2. Add two Doubles");
		System.out.println("3. Substract two Integers");
		System.out.println("4. Substract two Doubles");
		System.out.println("5. Multiply two Integers"); 
	}

}
