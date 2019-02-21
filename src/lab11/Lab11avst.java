// Lab11avst.java
// Kush Dalal
// 2/12/2019
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
		System.out.println("\nCOMPUTING PRIME NUMBERS");

		for (int i = 0; i < primes.length; i++)
		{
			primes[i] = true;
		}

		for (int i = 0; i < primes.length; i++)
		{
			if (primes[i])
				primes[i] = isPrime(i);

			if (primes[i])
			{
				for (int j = i * i; j < primes.length; j += i)
				{
					primes[j] = false;
				}
			}

		}

	}

	public static void displayPrimes(boolean primes[])
	{
		DecimalFormat DF = new DecimalFormat("0000");
		System.out.println("\n\nPRIMES BETWEEN 1 AND " + primes.length);
		int k = 10;
		for (int i = 0; i < primes.length; i++)
		{
			if (primes[i])
			{
				System.out.print(DF.format(i) + " ");
				if(i % 10 == 0)
				{
					System.out.println("");
				}
				
			}

		}

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
