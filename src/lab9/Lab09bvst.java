// Lab09bvst.java
// The Rational Class Program II
// This is the student, starting version of the Lab09b assignment.
// Kush Dalal 1/24/2019
package lab9;

import java.util.Scanner;

public class Lab09bvst
{
	private static int num1, den1; // numerator and denominator of the 1st rational number
	private static int num2, den2; // numerator and denominator of the 2nd rational number

	public static void main(String args[])
	{

		enterData();

		Rational2 r1 = new Rational2(num1, den1);
		Rational2 r2 = new Rational2(num2, den2);
		Rational2 r3 = new Rational2();

		r3.multiply(r1, r2); //multiply
		System.out.println("\n\n" + r1.getOriginal() + " * " + r2.getOriginal() + "  =  " + r3.getReduced());
		r3.divide(r1, r2); //divide
		System.out.println("\n" + r1.getOriginal() + " / " + r2.getOriginal() + "  =  " + r3.getReduced());
		r3.add(r1, r2); //Add
		System.out.println("\n" + r1.getOriginal() + " + " + r2.getOriginal() + "  =  " + r3.getReduced());
		r3.subtract(r1, r2); //subtract
		System.out.println("\n" + r1.getOriginal() + " - " + r2.getOriginal() + "  =  " + r3.getReduced());
		System.out.println();

	}
	//Input//
	public static void enterData()
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the 1st numerator ----> ");
		num1 = input.nextInt();
		System.out.print("\nEnter the 1st denominator --> ");
		den1 = input.nextInt();
		System.out.print("\nEnter the 2nd numerator ----> ");
		num2 = input.nextInt();
		System.out.print("\nEnter the 2nd denominator --> ");
		den2 = input.nextInt();
	}
}

//Lab notebook for Lab09b
/* 
 * After taking what i got from lab 9a, i had to add a couple new methods involving the multiple inputs.
 * That would be the Rational2 class. From there i took to reducing, by copy pasting code from the first
 * lab. next i had to work on multiplying and dividing. this was easily done by using the this method and
 * just multiplying the numerators and denominators. As for division, i just multiplied by the reciprocals
 * Next i had to do addition, this was a bit trickier as i had to get the common denominator, which i did 
 * by just multiplying by the opposite denominators. For subtraction, i just had to replace the sign. 
 * Lastly, i just made sure it all ran properly and was all compiled, and thats that.
 * 
 * 
 */ 
