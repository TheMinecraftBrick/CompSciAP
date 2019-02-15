// Lab11avst.java
// Kush Dalal
// 2/12/2019
// v1.7
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.
package lab11;

import java.util.Scanner;

public class Lab11avst
{
	public static void main(String[] args)
	{
		// This main method needs additions for the 100 point version.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the primes upper bound  ===>>  ");
		final int MAX = input.nextInt();
		boolean primes[] = new boolean[MAX];
		computePrimes(primes);
		displayPrimes(primes);
	}

	public static void computePrimes(boolean primes[])
	{
		for (int i = 0; i < primes.length; i++)
		{
			primes[i] = true;
		}

		for (int i = 0; i < primes.length; i++)
		{
			if (primes[i])
			{
				primes[i] = isPrime(i);
			}
		}
		System.out.println("\nCOMPUTING PRIME NUMBERS");

	}

	public static void displayPrimes(boolean primes[])
	{
		System.out.println("\n\nPRIMES BETWEEN 1 AND " + primes.length);
		System.out.println(primes);

	}

	public static boolean isPrime(int num)
	{
		for (int i = 2; i <= num / 2; i++)
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		if (num <= 1)
			return false; 
		else
			return true;

	}

}
