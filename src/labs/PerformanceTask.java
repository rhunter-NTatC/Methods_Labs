package labs;

import java.util.Scanner;

public class PerformanceTask {

	/*
	 * Instance Variables (class parameters)
	 *  - Accessible AND changeable in ANY method
	 *       Very convenient, but dangerous.
	 *  - declared only!!
	 *  - You must initialize them before using
	 *  
	 *  Place them all here.
	 */
	private static int playerHandTotal;
	private static String playerHand;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void welcomeMessage() {
		
		
		
	}
	
	
	/*
	 * Keep the starter code
	 * Feel free to change it to suit your needs.
	 */
	public static void main(String[] args) {
		
		//initialize instance variables
		playerHandTotal = 0;
		
		
		char keepPlaying = 'y';
		
		//Welcome them to the game
		//Place welcome message method here!
		welcomeMessage();
		
		
		while (keepPlaying == 'y') {
			
			//just puts a space after the welcome message
			System.out.println();
			
			
			//Start game here
			playGame();
			
			
			
			//Ask if they want to play again?
			//Loop until they give a valid answer
			keepPlaying = 'a';  //so the loop will start
			while (keepPlaying != 'y' && keepPlaying != 'n') {
			
				/*
				 * You only need the first letter
				 * So I...
				 * 	- made it lower case
				 * 	- then grabbed the first character as a char
				 */
				keepPlaying = getString("\nPlay again? (Y or N): ").toLowerCase().charAt(0);
				
				if (keepPlaying != 'y' && keepPlaying != 'n') {
					System.out.println("\nI didn't regcognize that answer.");
				}
				
			}
		}
		
		
		//Say goodbye
		System.out.println("\nIt's been fun!");
		System.out.println("Come back soon!");
		
	}
	
	
}
