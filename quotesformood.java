// Name: Antonio Olivera
// This program will be asking the user to enter a mood like (happy,sad,exciting,motivational,etc.) and it will output some quote for that mood the user enters
// September 25, 2022

import java.util.Scanner;

public class quotesformood {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// Asing the user the mood for the quote they want to see
		System.out.println("Enter a mood for a quote: ");
		System.out.println("\n 1. Happy Quotes");
		System.out.println("\n 2. Sad Quotes");
		System.out.println("\n 3. Worried Quotes");
		System.out.println("\n 4. Motivational Qoutes");
		System.out.println("\n 5. Bad Bitch Energy Quotes");
		int mood = input.nextInt();

		
		if (mood == 1) {  // printing a happy quote
			System.out.println("Live, Love, Laugh");

		} else if (mood == 2) { // printing a sad quote
			System.out.println("Its okay to cry. ");

		} else if (mood == 3) { // printing a worried quote
			System.out.println("The past is the past, the present is now so dont worry about the whats going to happen in the future, because we cant control the future. Live in the moement");

		} else if (mood == 4) { // printing a motivational quote
			System.out.println("10% is better than 0%!!!");

		} else if (mood == 5) { // printing a bad bitch energy quote
			System.out.println("Eat me out and pay me out - M.T.S");
		}

	}

}
