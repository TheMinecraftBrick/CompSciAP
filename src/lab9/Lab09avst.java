// Lab09avst.java
// The Rational Class Program I
// This is the student, starting version of the Lab09a assignment.
package lab9;

import java.util.Scanner;


public class Lab09avst
{
	private static int num, den;   // numerator and denominator of the rational number

	public static void main (String[] args)
	{
		enterData();
		Rational r = new Rational(num,den);
		r.displayData();
	}

	public static void enterData()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the numerator ----> ");
		num = input.nextInt();
		System.out.print("\nEnter the denominator --> ");
		den = input.nextInt();
	}
}











