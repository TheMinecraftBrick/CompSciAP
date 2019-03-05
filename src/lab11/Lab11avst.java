// Lab11avst.java
// Kush Dalal
// 3/1/2019
// v1.7
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.
package lab11;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Lab11avst
{
	public static void main(String[] args)
	{
		boolean restart = true;
		while (restart)
		{
			// This main method needs additions for the 100 point version.
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the primes upper bound  ===>>  "); //Request the max
			final int MAX = input.nextInt();
			boolean primes[] = new boolean[MAX]; //create the array with up to the max number the user inputted
			computePrimes(primes);	//solve for all the primes
			displayPrimes(primes);	//show all the primes
			restart = false; //for the restart
			Scanner input2 = new Scanner(System.in);
			System.out.print("\n\nPress enter to continue... ");
			String repeat = input2.nextLine();
			restart = (repeat.equalsIgnoreCase("")); //check if enter was pressed
		}
	}



	public static void computePrimes(boolean primes[])
	{
		System.out.println("\nCOMPUTING PRIME NUMBERS");

		for (int i = 0; i < primes.length; i++)
		{
			primes[i] = true; //for every number in the array, set all numbers to true
		}

		for (int i = 0; i < primes.length; i++)
		{
			if (primes[i]) //if the number is defined as true, actually check it using the isPrime method
				primes[i] = isPrime(i);

			if (primes[i])
			{
				for (int j = i * i; j < primes.length; j += i) //this for loop multiplies by itself, as every number that is prime +1 will be prime
				{
					primes[j] = false; //set all the primes that are not prime, to false
				}
			}

		}

	}

	public static void displayPrimes(boolean primes[])
	{
		DecimalFormat DF = new DecimalFormat("0000");
		System.out.println("\n\nPRIMES BETWEEN 1 AND " + primes.length);
		int drop = 0;

		for (int i = 0; i < primes.length; i++) //for each number 
		{
			if (primes[i]) //check if it is prime
			{
				drop++;
				System.out.print(DF.format(i) + " "); //display the primes only
				if (drop % 15 == 0) //if its a multiple of 15, drop down a line
				{
					System.out.println(" "); //drop a line
				} 

			}

		}

	}

	public static boolean isPrime(int num) //method to check if its prime
	{ 
		for (int i = 2; i <= num / 2; i++) //how to check primes, 
		{
			if (num % i == 0) // if the remainder of that is 0 its not prime
			{
				return false;
			}
		}
		if (num <= 1) //if the number is 1, its not prime
			return false;
		else
			return true; //everything else should be prime

	}

}
