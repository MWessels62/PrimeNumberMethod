package task11;

import java.util.Scanner;

public class PrimeNumberMethod {
	
	//default value, will change to false if value is found to be divisible by anything other than 1 or itself
	
	
	//Determines whether or not a number is prime 
	public boolean isPrime(int inputNum) {
		boolean prime = true;
		for (int i = 2; i < inputNum && i < inputNum/2; i++ ){
			if (inputNum % i == 0) {
				prime = false; 
			}
		}
		return prime;
	}
	
	public static void main(String[] args) {
		PrimeNumberMethod newTest = new PrimeNumberMethod();
		
		//Get integer from user
		Scanner input = new Scanner(System.in);
		int userInput = -1;
		
		while (userInput != 0) {
			System.out.println("\nType in an integer to check if it is prime... (Zero/0 to exit): ");
			
			userInput = input.nextInt(); 

			//Determine output string
			String outputMessage;
			if (newTest.isPrime(userInput) == true) {
				outputMessage = "IS a prime number";
			} else {
				outputMessage = "IS NOT a prime number";
			}
			System.out.println("The number you entered (" + userInput + ") " + outputMessage);
		}
		input.close();
	}

}