package task11;

import java.util.Scanner;

public class PrimeNumberMethod {
	
	//default value, will change to false if value is found to be divisible by anything other than 1 or itself
	boolean prime = true;
	
	public boolean isPrime(int inputNum) {
		for (int i = 2; i < inputNum && i < 10; i++ ){
			if (inputNum % i == 0) {
				prime = false; 
			}
		}
		return prime;
	}
	
	public static void main(String[] args) {
		PrimeNumberMethod newTest = new PrimeNumberMethod();
		
		Scanner input = new Scanner(System.in);

		//Get integer from user
		System.out.println("Type in an integer to check if it is prime... ");
		int userInput = input.nextInt(); 
		
		//Determine output string
		String outputMessage;
		if (newTest.isPrime(userInput) == true) {
			outputMessage = "IS a prime number";
		} else {
			outputMessage = "IS NOT a prime number";
		}
		System.out.println("The number you entered (" + userInput + ") " + outputMessage);
	}

}
