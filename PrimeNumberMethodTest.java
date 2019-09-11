package task11;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.*;

class PrimeNumberMethodTest {
	@Test
	public void testPrimeNumber() {
		int testNum = 19;
		
		PrimeNumberMethod tester = new PrimeNumberMethod();
		
		assertTrue("Does not correctly assess prime number!",primeTest(testNum) == tester.isPrime(testNum));
	}
	
	//Code directly off of the internet to test for a prime number
	public boolean primeTest(int num) {
		int temp;
		boolean isPrime = true;
		for(int i=2;i<=num/2;i++) {
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		   }
		}
		return isPrime;
	}
}
