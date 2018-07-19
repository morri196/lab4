package Lab4Powers;

import java.util.Scanner;

public class SquaresAndCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		String input;
		
		System.out.println("Learn your squares and cubes!");
		/*program needs to take user input, printing each number counting down from user input.
		 * Then evaluate user input when squared and cubed. 
		 While placing numbers in columns horizontally to each corresponding user input.
		*/
		
		do {
		System.out.println("Enter an integer: ");//user must enter an integer for the program to evaluate
		int userInput = scnr.nextInt();
		
			for (int i = 1; i <=  userInput; i++) {//this tells our numbers to count down from user input and stop at 1
			
            System.out.printf("%-10s %-10s %-10s\n", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));//formats layout columns for corresponding math evaluations
			}
            System.out.println("Continue? (y/n) ");
            input = scnr.next();//string input was initialized in the beginning
		}
		while (input.equals("y"));
	
		
		System.out.println("Goodbye");
	}
	
}