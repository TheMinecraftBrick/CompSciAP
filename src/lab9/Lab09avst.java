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

//-----------Lab notes for lab 9a-----------\\
/*
 * the first step was to make sure the decimal returned a double, so i made the numerator and denominator a double
 * then cast them to ints when used later on, for simplicity.
 * Next, in the get orginal method i simply put in my numerator and denominator along with a /, which thne compiled into one
 * large string to return. 
 * 
 * the get decimal method simply defines a double which i then mathematically divide the numerator and denominator
 * to a decimal, which is then returned
 * 
 * lastly, for reducing, once i get the gcf, i simply divide the original numerator and denominators by the gcf
 * to get the reduced numerators and denominators. Lastly i compile it to a string and return that.
 */
//------------------------------------------\\










